package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImpl__quals__j_e_i_Any_j_e_i_Default_o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImplTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImpl__quals__j_e_i_Any_j_e_i_Default.o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImplTemplateResource {
  private static Type_factory__o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImpl__quals__j_e_i_Any_j_e_i_Default_o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImplTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImpl__quals__j_e_i_Any_j_e_i_Default_o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImplTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/tiagobento/redhat/kiegroup-all/kie-wb-common/kie-wb-common-stunner/kie-wb-common-stunner-extensions/kie-wb-common-stunner-forms/kie-wb-common-stunner-forms-client/target/kie-wb-common-stunner-forms-client-7.47.0-SNAPSHOT-sources.jar!/org/kie/workbench/common/stunner/forms/client/widgets/FormPropertiesWidgetViewImpl.html
      public String getText() {
        return "<div class=\"container-fluid\">\n    <div class=\"row\">\n        <div class=\"col-md-12\" data-field=\"formContent\"></div>\n    </div>\n</div>";
      }
      public String getName() {
        return "getContents";
      }
    }
    ;
  }
  private static class getContentsInitializer {
    static {
      _instance0.getContentsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return getContents;
    }
  }
  public com.google.gwt.resources.client.TextResource getContents() {
    return getContentsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImpl__quals__j_e_i_Any_j_e_i_Default.o_k_w_c_s_f_c_w_FormPropertiesWidgetViewImplTemplateResource::getContents()();
    }
    return null;
  }-*/;
}
