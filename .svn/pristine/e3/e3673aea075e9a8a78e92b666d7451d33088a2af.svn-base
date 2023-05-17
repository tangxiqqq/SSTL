(function($) {
    "use strict";

        if(typeof revslider_showDoubleJqueryError === "undefined") {
                  function revslider_showDoubleJqueryError(sliderID) {
                    var err = "<div class='rs_error_message_box'>";
                    err += "<div class='rs_error_message_oops'>Oops...</div>";
                    err += "<div class='rs_error_message_content'>";
                    err += "You have some jquery.js library include that comes after the Slider Revolution files js inclusion.<br>";
                    err += "To fix this, you can:<br>&nbsp;&nbsp;&nbsp; 1. Set 'Module General Options' ->  'jQuery & OutPut Filters' -> 'Put JS to Body' to on";
                    err += "<br>&nbsp;&nbsp;&nbsp; 2. Find the double jQuery.js inclusion and remove it";
                    err += "</div>";
                  err += "</div>";
                    jQuery(sliderID).show().html(err);
          }
        }



        var revapi1,
                tpj;
              jQuery(function() {
                tpj = jQuery;
                if(tpj("#rev_slider_1_1").revolution == undefined){
                  revslider_showDoubleJqueryError("#rev_slider_1_1");
                }else{
                  revapi1 = tpj("#rev_slider_1_1").show().revolution({
                    jsFileLocation:"js/",
                    sliderLayout:"fullwidth",
                    visibilityLevels:"1240,1024,778,480",
                    gridwidth:"1240,1024,778,480",
                    gridheight:"900,700,600,450",
                    minHeight:"",
                    spinner:"spinner0",
                    editorheight:"900,700,600,450",
                    responsiveLevels:"1240,1024,778,480",
                    disableProgressBar:"on",
                    navigation: {
                      onHoverStop:false,
                      bullets: {
                        enable:true,
                        tmp:"<span class=\"tp-bullet-image\"></span>",
                        style:"hebe"
                      }
                    },
                    fallbacks: {
                      allowHTML5AutoPlayOnAndroid:true
              },
            });
          }

        });

})(jQuery);