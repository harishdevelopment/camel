/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.avro;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AvroEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("transport", org.apache.camel.component.avro.AvroTransport.class);
        map.put("port", int.class);
        map.put("host", java.lang.String.class);
        map.put("messageName", java.lang.String.class);
        map.put("protocol", org.apache.avro.Protocol.class);
        map.put("protocolClassName", java.lang.String.class);
        map.put("protocolLocation", java.lang.String.class);
        map.put("reflectionProtocol", boolean.class);
        map.put("singleParameter", boolean.class);
        map.put("uriAuthority", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AvroEndpoint target = (AvroEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "protocol": target.getConfiguration().setProtocol(property(camelContext, org.apache.avro.Protocol.class, value)); return true;
        case "protocolclassname":
        case "protocolClassName": target.getConfiguration().setProtocolClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "protocollocation":
        case "protocolLocation": target.getConfiguration().setProtocolLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "reflectionprotocol":
        case "reflectionProtocol": target.getConfiguration().setReflectionProtocol(property(camelContext, boolean.class, value)); return true;
        case "singleparameter":
        case "singleParameter": target.getConfiguration().setSingleParameter(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "uriauthority":
        case "uriAuthority": target.getConfiguration().setUriAuthority(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AvroEndpoint target = (AvroEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "protocol": return target.getConfiguration().getProtocol();
        case "protocolclassname":
        case "protocolClassName": return target.getConfiguration().getProtocolClassName();
        case "protocollocation":
        case "protocolLocation": return target.getConfiguration().getProtocolLocation();
        case "reflectionprotocol":
        case "reflectionProtocol": return target.getConfiguration().isReflectionProtocol();
        case "singleparameter":
        case "singleParameter": return target.getConfiguration().isSingleParameter();
        case "synchronous": return target.isSynchronous();
        case "uriauthority":
        case "uriAuthority": return target.getConfiguration().getUriAuthority();
        default: return null;
        }
    }
}

