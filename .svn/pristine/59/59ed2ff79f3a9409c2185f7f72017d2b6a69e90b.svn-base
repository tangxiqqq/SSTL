package com.sstl.controller;

import com.alibaba.fastjson.JSONObject;
import com.sstl.pojo.Articles;
import com.sstl.pojo.Indexamount;
import com.sstl.service.SSTLService;
import com.sstl.util.PhoneFormatCheckUtils;
import com.sstl.util.RandomGUID;
import com.sstl.util.SSTLUtils;
import com.sstl.webservices.ProjectOperateforWeChat.LmTeProject;
import com.sstl.webservices.ProjectOperateforWeChat.ProjectOperateforWeChat;
import com.sstl.webservices.ProjectService.ArrayOfProject;
import com.sstl.webservices.ProjectService.ProjectServices;
import com.sstl.webservices.SatisfactionOperate.LmTeSatisfaction;
import com.sstl.webservices.SatisfactionOperate.SatisfactionOperate;
import com.sstl.webservices.SendMessage.ArrayOfString;
import com.sstl.webservices.SendMessage.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Controller
public class SSTLController {

    @Autowired
    SSTLService sstlService;

    private PhoneFormatCheckUtils phoneFormatCheckUtils;

    @RequestMapping("/")
    public String toIndex() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        try {
            List<Indexamount> indexamountList = sstlService.getIndexAmount();
            List<Integer> articlesIDList = sstlService.selectArticlesIDByTypeStr("新闻中心");
            List<Articles> modelList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                modelList.add(sstlService.selectSmallArticleByID(articlesIDList.get(i)));
            }
            model.addAttribute("newsList", modelList);
            List<Integer> testArticlesIDList = sstlService.selectArticlesIDByTypeStr("业务介绍");
            List<Articles> modelList2 = new ArrayList<>();
            for (int i = 0; i < testArticlesIDList.size(); i++) {
                modelList2.add(sstlService.selectSmallArticleByID(testArticlesIDList.get(i)));
            }
            model.addAttribute("testList",modelList2);
            model.addAttribute("indexamount1", indexamountList.get(0).getIndexamountvalue());
            model.addAttribute("indexamount2", indexamountList.get(1).getIndexamountvalue());
            model.addAttribute("indexamount3", indexamountList.get(2).getIndexamountvalue());
            model.addAttribute("indexamount4", indexamountList.get(3).getIndexamountvalue());
            return "index";
        } catch (Exception e) {
            return "redirect:/500";
        }
    }

    @GetMapping("list")
    public String list(String typestr, Model model) {
        try {
            if ("新闻中心｜评测申请｜业务介绍｜典型案例｜技术交流｜公示公告｜报告公告｜知识产权".contains(typestr)) {
                List<Articles> articlesList = sstlService.selectSmallArticlesByTypeStr(typestr);
                model.addAttribute("articlesList", articlesList);
                model.addAttribute("typestr", typestr);
                if ("新闻中心".equals(typestr)) {
                    return "list";
                } else if("业务介绍".equals(typestr)){
                    return "list-timeless";
                }
                else{
                    return "list-imageless";
                }
            } else {
                return "redirect:/404";
            }
        } catch (Exception e) {
            return "redirect:/500";
        }
    }

    @GetMapping("sublist")
    public String sublist(String subtypestr, Model model) {
        try {
            if ("质量服务产品｜安全服务产品".contains(subtypestr)) {
                List<Articles> articlesList = sstlService.selectSmallArticlesBySubTypeStr(subtypestr);
                model.addAttribute("articlesList", articlesList);
                model.addAttribute("typestr", subtypestr);
                return "list-timeless";
            } else {
                return "redirect:/404";
            }
        } catch (Exception e) {
            return "redirect:/500";
        }
    }

    @RequestMapping("/article")
    public String article(Model model, String articleId) {
        try {
            int id = Integer.parseInt(articleId);
            Articles articles = sstlService.selectArticleByID(id);
            model.addAttribute("article", articles);
            String typestr = articles.getTypestr();
            List<Articles> articlesList = sstlService.selectSmallArticlesNextFour(typestr, id);
            if (articlesList.size() > 4) {
                List<Articles> modelList = new ArrayList<>();
                for (int i = 0; i < 4; i++) {
                    modelList.add(articlesList.get(i));
                }
                model.addAttribute("nearList", modelList);
            } else {
                model.addAttribute("nearList", articlesList);
            }
            model.addAttribute("typestr", typestr);
            if (typestr.equals("新闻中心")) {
                return "article";
            } else if (typestr.equals("业务介绍")) {
                return "article-imagetimeless";
            }
            else {
                return "article-imageless";
            }
        } catch (Exception e) {
            return "redirect:/500";
        }
    }

    @RequestMapping(value = "/searchArticle", method = RequestMethod.POST)
    public String searchArticle(@RequestParam("title") String title, Model model) {
        try {
            List<Articles> articlesList = sstlService.selectArticlesByTitle("%" + title + "%");
            model.addAttribute("articlesList", articlesList);
            model.addAttribute("typestr", "搜索结果");
            return "list-imageless";
        } catch (Exception e) {
            return "redirect:/500";
        }
    }

    @RequestMapping(value = "/searchReport")
    public String searchReport(@RequestParam(value = "your-phone", required = false) String phone, Model model) {
        model.addAttribute("phone", phone);
        return "query-project";
    }

    @RequestMapping("searchReportDetail")
    public String searchReportDetail(Model model, @RequestParam("phoneforver") String phone, @RequestParam("vercode") String vercode, HttpSession session) {
        try {
            if (phone.isEmpty()) {
                model.addAttribute("content", "请输入手机号！");
                return "query-project-result";
            } else {
                if (!phoneFormatCheckUtils.isPhoneLegal(phone)) {
                    model.addAttribute("content", "请输入有效手机号！");
                    return "query-project-result";
                }
            }
            if (vercode.isEmpty()) {
                model.addAttribute("content", "请输入验证码！");
                return "query-project-result";
            }
            if (session.getAttribute("VerCode") == null) {
                model.addAttribute("content", "请先获取验证码！");
                return "query-project-result";
            }
            Map<String, String> codeMap = (Map<String, String>) session.getAttribute("VerCode");
            if (!vercode.equals(codeMap.get("code"))) {
                String times = codeMap.get("times");
                int t = Integer.parseInt(times);
                if (t == 0) {
                    session.removeAttribute("VerCode");
                    model.addAttribute("content", "连续输入验证码错误，请重新获取验证码！");
                    return "query-project-result";
                } else {
                    t--;
                    codeMap.remove("times");
                    codeMap.put("times", String.valueOf(t));
                    session.setAttribute("VerCode", codeMap);
                    model.addAttribute("content", "验证码错误！");
                    return "query-project-result";
                }
            }
            session.removeAttribute("VerCode");
        } catch (Exception e) {
            return "redirect:/500";
        }
        ProjectServices projectServices = new ProjectServices();
        ArrayOfProject arrayOfProject = projectServices.getProjectServicesSoap().getProjectList("SSTL_ReportCheck", "sstltest" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), phone);
        if (arrayOfProject.getProject().size() == 0) {
            model.addAttribute("content", "无项目信息");
        } else {
            model.addAttribute("content", "测试进度：");
            model.addAttribute("pjlist", arrayOfProject.getProject());
        }
        return "query-project-result";
    }

    @RequestMapping("onlinebusinessmodule/forpublicaccount/reportval.aspx")
    public String reportval(@RequestParam(value = "id", required = false) String id, Model model) {
        try {
            if (id == null) {
                return "redirect:/404";
            } else {
                if (!id.isEmpty()) {
                    String url = "http://192.168.250.54:7070/WebServices/JSON/CheckReport.ashx?id=" + id;
                    String json = loadJson(url);
                    JSONObject jsonObject = JSONObject.parseObject(json);
                    if (jsonObject == null) {
                        model.addAttribute("content", "无效的二维码");
                        model.addAttribute("contact", "二维码信息缺失");
                        return "reportval-none";
                    }
                    if (!jsonObject.containsKey("Message")) {
                        model.addAttribute("projectName", jsonObject.getString("ProjectName"));
                        model.addAttribute("projectCode", jsonObject.getString("ProjectCode"));
                        model.addAttribute("company", jsonObject.getString("Company"));
                        model.addAttribute("manager", jsonObject.getString("ProjectMana"));
                        model.addAttribute("approval", jsonObject.getString("ProjectApp"));
                    } else {
                        model.addAttribute("content", jsonObject.getString("Message"));
                        model.addAttribute("contact", jsonObject.getString("Connect"));
                        return "reportval-none";
                    }
                } else {
                    model.addAttribute("content", "无效的二维码");
                    model.addAttribute("contact", "二维码信息缺失");
                    return "reportval-none";
                }
            }
            return "reportval";
        } catch (Exception e) {
            return "redirect:/404";
        }
    }

    @RequestMapping("onlinebusinessmodule/forpublicaccount/satisfaction.aspx")
    public String satisfaction(@RequestParam(value = "id", required = false) String id, @RequestParam(value = "uid", required = false) String uid, @RequestParam(value = "cid", required = false) String cid, @RequestParam(value = "guid", required = false) String guid, Model model) {
        try {
            if (id == null || uid == null || cid == null || guid == null) {
                model.addAttribute("cid", "");
                model.addAttribute("uid", "");
                model.addAttribute("guid", "");
            } else {
                model.addAttribute("cid", cid);
                model.addAttribute("uid", uid);
                model.addAttribute("guid", guid);
                if (!id.isEmpty()) {
                    int projectid = Integer.parseInt(id);
                    ProjectOperateforWeChat projectOperateforWeChat = new ProjectOperateforWeChat();
                    String Account = "SSTL_ReportCheck";
                    String timeStr1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    String Password = "sstltest" + timeStr1;
                    LmTeProject LmTeProject = projectOperateforWeChat.getProjectOperateforWeChatSoap().getProject(Account, Password, projectid);
                    if (LmTeProject != null) {
                        model.addAttribute("code", LmTeProject.getCode());
                        model.addAttribute("name", LmTeProject.getName());
                    }
                }
            }
            return "satisfaction";
        } catch (Exception e) {
            return "redirect:/404";
        }
    }

    @RequestMapping("getVerCode")
    @ResponseBody
    public void getVerCode(@RequestParam(value = "phone", required = false) String phone, HttpSession session) {
        try {
            if ((!phone.isEmpty()) && phoneFormatCheckUtils.isPhoneLegal(phone)) {
                if (Objects.nonNull(session.getAttribute("VerCode"))) {
                    Map<String, String> cm = (Map<String, String>) session.getAttribute("VerCode");
                    long st = Long.valueOf(cm.get("date"));
                    long nt = new Date().getTime();
                    long m = nt - st;
                    if (m > 60000) {
                        session.removeAttribute("VerCode");
                    }
                }
                if (!Objects.nonNull(session.getAttribute("VerCode"))) {
                    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
                    ArrayOfString arrayOfString = new ArrayOfString();
                    arrayOfString.getString().add(phone);
                    Map<String, String> codeMap = new HashMap<>();
                    String ccc = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
                    codeMap.put("code", ccc);
                    codeMap.put("times", "5");
                    codeMap.put("date", String.valueOf(new Date().getTime()));
                    session.setAttribute("VerCode", codeMap);
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.getSendMessageSoap().send("sstl_stm4", "sstltest", arrayOfString, "验证码:" + ccc, "");
                    scheduledExecutorService.schedule(new Thread(() -> {
                        if (Objects.nonNull(session.getAttribute("VerCode"))) {
                            session.removeAttribute("VerCode");
                        }
                    }), 600, TimeUnit.SECONDS);
                }
            }
        } catch (Exception e) {
        }
    }

    @RequestMapping("subContent")
    public String subContent(Model model, @ModelAttribute LmTeSatisfaction lmTeSatisfaction, HttpSession session) {
        try {
            if (lmTeSatisfaction.getCompanyName().isEmpty()) {
                model.addAttribute("content", "请输入公司名称！");
                return "query-project-result";
            }
            if (lmTeSatisfaction.getProjectName().isEmpty()) {
                model.addAttribute("content", "请输入项目名称！");
                return "query-project-result";
            }
            if (lmTeSatisfaction.getProjectCode().isEmpty()) {
                model.addAttribute("content", "请输入项目编号！");
                return "query-project-result";
            }
            if (lmTeSatisfaction.getMobile().isEmpty()) {
                model.addAttribute("content", "请输入手机号！");
                return "query-project-result";
            } else {
                if (!phoneFormatCheckUtils.isPhoneLegal(lmTeSatisfaction.getMobile())) {
                    model.addAttribute("content", "请输入有效手机号！");
                    return "query-project-result";
                }
            }
            if (lmTeSatisfaction.getTag3().isEmpty()) {
                model.addAttribute("content", "请输入验证码！");
                return "query-project-result";
            }
            if (session.getAttribute("VerCode") == null) {
                model.addAttribute("content", "请先获取验证码！");
                return "satisfaction-result";
            }
            Map<String, String> codeMap = (Map<String, String>) session.getAttribute("VerCode");
            if (!lmTeSatisfaction.getTag3().equals(codeMap.get("code"))) {
                String times = codeMap.get("times");
                int t = Integer.parseInt(times);
                if (t == 0) {
                    session.removeAttribute("VerCode");
                    model.addAttribute("content", "连续输入验证码错误，请重新获取验证码！");
                    return "satisfaction-result";
                } else {
                    t--;
                    codeMap.remove("times");
                    codeMap.put("times", String.valueOf(t));
                    session.setAttribute("VerCode", codeMap);
                    model.addAttribute("content", "验证码错误！");
                    return "satisfaction-result";
                }
            }
            session.removeAttribute("VerCode");
        } catch (Exception e) {
            return "redirect:/500";
        }
        lmTeSatisfaction.setVersion(1);
        lmTeSatisfaction.setGuid(new RandomGUID().toString());
        SSTLUtils sstlUtils = new SSTLUtils();
        lmTeSatisfaction.setInsertDt(sstlUtils.convertToXMLGregorianCalendar(new Date()));
        lmTeSatisfaction.setTag3(null);
        String Account = "SSTL_ReportCheck";
        String Password = "sstltest" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        SatisfactionOperate satisfactionOperate = new SatisfactionOperate();
        satisfactionOperate.getSatisfactionOperateSoap().submit(Account, Password, lmTeSatisfaction);
        model.addAttribute("content", "感谢提交！");
        return "satisfaction-result";
    }

    @RequestMapping("aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping("contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("impartiality")
    public String impartiality() {
        return "impartiality";
    }

    @RequestMapping("qualification")
    public String qualification() {
        return "qualification";
    }

    @ModelAttribute
    public void publicAnnouncement(Model model) {
        try {
            List<Articles> articlesList1 = sstlService.selectSmallArticlesByTypeStr("公示公告");
            if (articlesList1.size() > 3) {
                List<Articles> model1List = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    model1List.add(articlesList1.get(i));
                }
                model.addAttribute("publicList", model1List);
            } else {
                model.addAttribute("publicList", articlesList1);
            }
        } catch (Exception e) {

        }
    }

    @RequestMapping("/articletest")
    public String articleTest() {
        return "article-test";
    }

    public static String loadJson(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(url);
            URLConnection uc = urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
}
