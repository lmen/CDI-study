package pt.lmen.beans;

import java.util.Arrays;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@CompleteLog(logReturn = true)
@Interceptor
public class CompleteLogInterceptor {

	@AroundInvoke
	private Object managed(InvocationContext ctx) throws Exception {
		System.out.println("before" + ctx.getMethod().getName() + Arrays.toString(ctx.getParameters()));
		Object[] newParam = { "SLB Change from the interceptor" };
		ctx.setParameters(newParam);
		Object value = ctx.proceed();
		System.out.println("after: " + value);
		return value;
	}
}
