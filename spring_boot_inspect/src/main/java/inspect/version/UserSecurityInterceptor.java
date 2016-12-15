package inspect.version;


import org.springframework.http.RequestEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/**
 * 拦截未登录的用户信息
 * @author lance
 * 2014-6-10下午9:57:20
 */
public class UserSecurityInterceptor implements HandlerInterceptor  {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String version =  request.getHeader("version");
		if(version == "70"){
			Map <String,String[]> params = request.getParameterMap();
			StringBuffer sb = new StringBuffer();
			BufferedReader bufferedReader = null;
			bufferedReader =  request.getReader() ;
			char[] charBuffer = new char[512];
			int bytesRead;
			while ( (bytesRead = bufferedReader.read(charBuffer)) != -1 ) {
				sb.append(charBuffer, 0, bytesRead);
			}
			String updateUrl = "http://localhost:8004/wd/forum/topic/publishTopic";
			URL url = null;
			URI uri = null;
			try {
				url = new URL(updateUrl);
				uri = new URI(url.getProtocol(), url.getHost() + ":" + url.getPort(),url.getPath(), url.getQuery(), null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		StringBuilder builder = new StringBuilder();
		builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
		builder.append("alert(\"请重新登陆！\");");
		builder.append("window.location.href=\"/public/login.shtml\";");
		builder.append("Version:" + version);
		builder.append("</script>");
		out.print(builder.toString());
		out.close();
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}


}
