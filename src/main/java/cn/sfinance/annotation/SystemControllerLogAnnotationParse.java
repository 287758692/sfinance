package cn.sfinance.annotation;

import java.lang.reflect.Method;

/**
 * 权限注解解析器
 * 这个解析器的主要功能，是解析目标方法上如果有PrivilegeInfo注解，那么解析出这个注解中的value值（权限的值）
 * @author Minhellic
 *
 */
public class SystemControllerLogAnnotationParse {
    /**
     * 解析注解
     * @param targetClass　目标类的class形式
     * @param methodName　在客户端调用哪个方法,methodName就代表哪个方法　
     * @return
     * @throws Exception 
     */
	public static String parse(Class targetClass, String methodName) throws Exception {
        String methodAccess = "";
        /*
         * 为简单起见，这里考虑该方法没有参数
         */
        Class[] parameterTypes = SystemControllerLogAnnotationParse.getMethodParamTypes(targetClass,methodName);
        Method method = targetClass.getMethod(methodName,parameterTypes);
        //判断方法上是否有SystemControllerLog注解
        if (method.isAnnotationPresent(SystemControllerLog.class)) {
            //得到方法上的注解
        	SystemControllerLog systemControllerLog = method.getAnnotation(SystemControllerLog.class);
            methodAccess = systemControllerLog.value();
        }
        return methodAccess;
    }
    
    public static Class[]  getMethodParamTypes(Class classInstance, 
    	    String methodName) throws ClassNotFoundException{
    	    Class[] paramTypes = null;
    	    Method[]  methods = classInstance.getMethods();//全部方法
    	    for (int  i = 0;  i< methods.length; i++) {
    	        if(methodName.equals(methods[i].getName())){//和传入方法名匹配 
    	            Class[] params = methods[i].getParameterTypes();
    	            paramTypes = new Class[ params.length] ;
    	            for (int j = 0; j < params.length; j++) {
    	                paramTypes[j] = Class.forName(params[j].getName());
    	            }
    	            break; 
    	        }
    	    }
    	    return paramTypes;
    	}
}
