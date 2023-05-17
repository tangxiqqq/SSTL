<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s1="http://microsoft.com/wsdl/types/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:element name="CheckProjectByEncryptCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EncryptCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckProjectByEncryptCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckProjectByEncryptCodeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyProjectCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="UserId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyProjectCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetMyProjectCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyProjectList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="UserId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyProjectListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMyProjectListResult" type="tns:ArrayOfLmTeProject" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfLmTeProject">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="LmTeProject" nillable="true" type="tns:LmTeProject" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="LmTeProject">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="iid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name_short" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name_eng" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="kind" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sub_type" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="source" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="mana_id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="fee" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="income_fee" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="payout_fee" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="vss_path" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="product_id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="company_id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="contact_client_id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="tech_client_id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="contract_id" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="fk_relation" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="purpose" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="request" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="property" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="project_score" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="plan_start_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="plan_end_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="start_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="end_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="apply_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="check_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="archive_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="dispatch_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="apply_uid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="check_uid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="archive_uid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="dispatch_uid" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="fid" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="state" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="status" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="tag1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag6" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="hstate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="evaluation" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="field" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="qa_uid" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="authority" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="security" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dept" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sign_name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="show_test_purpose" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="prefee" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="proj_kind" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="invoice_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="invoice_num" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="pay_way" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_name_eng" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_address" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_zip" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_url" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_fax" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_Organizationcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="company_phone" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="reportcheck_uid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="reportapprove_uid" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="tag7" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag8" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag9" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag10" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag11" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag12" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag13" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag14" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag15" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag16" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag17" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag18" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetMyProjectListbyPage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="UserId" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="PageSize" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="PageIndex" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyProjectListbyPageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMyProjectListbyPageResult" type="tns:ArrayOfLmTeProject" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProject">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ProjectId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProjectResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetProjectResult" type="tns:LmTeProject" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProjectuserList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ProjectId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProjectuserListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetProjectuserListResult" type="tns:ArrayOfLmTeProjectuser" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfLmTeProjectuser">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="LmTeProjectuser" nillable="true" type="tns:LmTeProjectuser" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="LmTeProjectuser">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="iid" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          <s:element minOccurs="1" maxOccurs="1" name="project_id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="user_uid" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="role_code" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="plan_start_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="plan_end_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="start_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="end_dt" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="q_score" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="q_info" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="state" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="status" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="tag1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag6" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFlowUrl">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ProjectId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFlowUrlResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFlowUrlResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetExpertFinishDt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ProjectId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetExpertFinishDtResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetExpertFinishDtResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveProject">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="LmTeProject" type="tns:LmTeProject" />
            <s:element minOccurs="1" maxOccurs="1" name="UserId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveProjectResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaveProjectResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProjectCheckPass">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="LmTeProject" type="tns:LmTeProject" />
            <s:element minOccurs="1" maxOccurs="1" name="UserId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProjectCheckPassResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ProjectCheckPassResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProjectCheckNoPass">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Account" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="LmTeProject" type="tns:LmTeProject" />
            <s:element minOccurs="1" maxOccurs="1" name="UserId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProjectCheckNoPassResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ProjectCheckNoPassResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="CheckProjectByEncryptCodeSoapIn">
    <wsdl:part name="parameters" element="tns:CheckProjectByEncryptCode" />
  </wsdl:message>
  <wsdl:message name="CheckProjectByEncryptCodeSoapOut">
    <wsdl:part name="parameters" element="tns:CheckProjectByEncryptCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetMyProjectCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetMyProjectCount" />
  </wsdl:message>
  <wsdl:message name="GetMyProjectCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetMyProjectCountResponse" />
  </wsdl:message>
  <wsdl:message name="GetMyProjectListSoapIn">
    <wsdl:part name="parameters" element="tns:GetMyProjectList" />
  </wsdl:message>
  <wsdl:message name="GetMyProjectListSoapOut">
    <wsdl:part name="parameters" element="tns:GetMyProjectListResponse" />
  </wsdl:message>
  <wsdl:message name="GetMyProjectListbyPageSoapIn">
    <wsdl:part name="parameters" element="tns:GetMyProjectListbyPage" />
  </wsdl:message>
  <wsdl:message name="GetMyProjectListbyPageSoapOut">
    <wsdl:part name="parameters" element="tns:GetMyProjectListbyPageResponse" />
  </wsdl:message>
  <wsdl:message name="GetProjectSoapIn">
    <wsdl:part name="parameters" element="tns:GetProject" />
  </wsdl:message>
  <wsdl:message name="GetProjectSoapOut">
    <wsdl:part name="parameters" element="tns:GetProjectResponse" />
  </wsdl:message>
  <wsdl:message name="GetProjectuserListSoapIn">
    <wsdl:part name="parameters" element="tns:GetProjectuserList" />
  </wsdl:message>
  <wsdl:message name="GetProjectuserListSoapOut">
    <wsdl:part name="parameters" element="tns:GetProjectuserListResponse" />
  </wsdl:message>
  <wsdl:message name="GetFlowUrlSoapIn">
    <wsdl:part name="parameters" element="tns:GetFlowUrl" />
  </wsdl:message>
  <wsdl:message name="GetFlowUrlSoapOut">
    <wsdl:part name="parameters" element="tns:GetFlowUrlResponse" />
  </wsdl:message>
  <wsdl:message name="GetExpertFinishDtSoapIn">
    <wsdl:part name="parameters" element="tns:GetExpertFinishDt" />
  </wsdl:message>
  <wsdl:message name="GetExpertFinishDtSoapOut">
    <wsdl:part name="parameters" element="tns:GetExpertFinishDtResponse" />
  </wsdl:message>
  <wsdl:message name="SaveProjectSoapIn">
    <wsdl:part name="parameters" element="tns:SaveProject" />
  </wsdl:message>
  <wsdl:message name="SaveProjectSoapOut">
    <wsdl:part name="parameters" element="tns:SaveProjectResponse" />
  </wsdl:message>
  <wsdl:message name="ProjectCheckPassSoapIn">
    <wsdl:part name="parameters" element="tns:ProjectCheckPass" />
  </wsdl:message>
  <wsdl:message name="ProjectCheckPassSoapOut">
    <wsdl:part name="parameters" element="tns:ProjectCheckPassResponse" />
  </wsdl:message>
  <wsdl:message name="ProjectCheckNoPassSoapIn">
    <wsdl:part name="parameters" element="tns:ProjectCheckNoPass" />
  </wsdl:message>
  <wsdl:message name="ProjectCheckNoPassSoapOut">
    <wsdl:part name="parameters" element="tns:ProjectCheckNoPassResponse" />
  </wsdl:message>
  <wsdl:portType name="ProjectOperateforWeChatSoap">
    <wsdl:operation name="CheckProjectByEncryptCode">
      <wsdl:input message="tns:CheckProjectByEncryptCodeSoapIn" />
      <wsdl:output message="tns:CheckProjectByEncryptCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectCount">
      <wsdl:input message="tns:GetMyProjectCountSoapIn" />
      <wsdl:output message="tns:GetMyProjectCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectList">
      <wsdl:input message="tns:GetMyProjectListSoapIn" />
      <wsdl:output message="tns:GetMyProjectListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectListbyPage">
      <wsdl:input message="tns:GetMyProjectListbyPageSoapIn" />
      <wsdl:output message="tns:GetMyProjectListbyPageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProject">
      <wsdl:input message="tns:GetProjectSoapIn" />
      <wsdl:output message="tns:GetProjectSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProjectuserList">
      <wsdl:input message="tns:GetProjectuserListSoapIn" />
      <wsdl:output message="tns:GetProjectuserListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFlowUrl">
      <wsdl:input message="tns:GetFlowUrlSoapIn" />
      <wsdl:output message="tns:GetFlowUrlSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetExpertFinishDt">
      <wsdl:input message="tns:GetExpertFinishDtSoapIn" />
      <wsdl:output message="tns:GetExpertFinishDtSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SaveProject">
      <wsdl:input message="tns:SaveProjectSoapIn" />
      <wsdl:output message="tns:SaveProjectSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ProjectCheckPass">
      <wsdl:input message="tns:ProjectCheckPassSoapIn" />
      <wsdl:output message="tns:ProjectCheckPassSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ProjectCheckNoPass">
      <wsdl:input message="tns:ProjectCheckNoPassSoapIn" />
      <wsdl:output message="tns:ProjectCheckNoPassSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ProjectOperateforWeChatSoap" type="tns:ProjectOperateforWeChatSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CheckProjectByEncryptCode">
      <soap:operation soapAction="http://tempuri.org/CheckProjectByEncryptCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectCount">
      <soap:operation soapAction="http://tempuri.org/GetMyProjectCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectList">
      <soap:operation soapAction="http://tempuri.org/GetMyProjectList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectListbyPage">
      <soap:operation soapAction="http://tempuri.org/GetMyProjectListbyPage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProject">
      <soap:operation soapAction="http://tempuri.org/GetProject" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProjectuserList">
      <soap:operation soapAction="http://tempuri.org/GetProjectuserList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFlowUrl">
      <soap:operation soapAction="http://tempuri.org/GetFlowUrl" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetExpertFinishDt">
      <soap:operation soapAction="http://tempuri.org/GetExpertFinishDt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveProject">
      <soap:operation soapAction="http://tempuri.org/SaveProject" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ProjectCheckPass">
      <soap:operation soapAction="http://tempuri.org/ProjectCheckPass" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ProjectCheckNoPass">
      <soap:operation soapAction="http://tempuri.org/ProjectCheckNoPass" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ProjectOperateforWeChatSoap12" type="tns:ProjectOperateforWeChatSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CheckProjectByEncryptCode">
      <soap12:operation soapAction="http://tempuri.org/CheckProjectByEncryptCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectCount">
      <soap12:operation soapAction="http://tempuri.org/GetMyProjectCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectList">
      <soap12:operation soapAction="http://tempuri.org/GetMyProjectList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyProjectListbyPage">
      <soap12:operation soapAction="http://tempuri.org/GetMyProjectListbyPage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProject">
      <soap12:operation soapAction="http://tempuri.org/GetProject" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProjectuserList">
      <soap12:operation soapAction="http://tempuri.org/GetProjectuserList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFlowUrl">
      <soap12:operation soapAction="http://tempuri.org/GetFlowUrl" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetExpertFinishDt">
      <soap12:operation soapAction="http://tempuri.org/GetExpertFinishDt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveProject">
      <soap12:operation soapAction="http://tempuri.org/SaveProject" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ProjectCheckPass">
      <soap12:operation soapAction="http://tempuri.org/ProjectCheckPass" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ProjectCheckNoPass">
      <soap12:operation soapAction="http://tempuri.org/ProjectCheckNoPass" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="ProjectOperateforWeChat">
    <wsdl:port name="ProjectOperateforWeChatSoap" binding="tns:ProjectOperateforWeChatSoap">
      <soap:address location="http://192.168.250.54:7070/WebServices/wechat/ProjectOperateforWeChat.asmx" />
    </wsdl:port>
    <wsdl:port name="ProjectOperateforWeChatSoap12" binding="tns:ProjectOperateforWeChatSoap12">
      <soap12:address location="http://192.168.250.54:7070/WebServices/wechat/ProjectOperateforWeChat.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>