package cn.bonc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bonc.entity.Province;
import cn.bonc.utils.JsonUtils;

/**
 * Servlet implementation class SsssssServlet
 */
@WebServlet("/ssssss")
public class SsssssServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SsssssServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       System.out.println("接收到请求...");

	   /* String s1 = "ssssss";
	    request.setAttribute("data",s1);
	    request.getRequestDispatcher("data.jsp").forward(request,response);*/
	       Province p1 = new Province();
	        Province p2 = new Province();
	        Province p3 = new Province();
	        p1.setId(1);
	        p1.setName("山东");
	        p2.setId(2);
	        p2.setName("河北");
	        p3.setId(3);
	        p3.setName("北京");
	        List<Province> list = new ArrayList<Province>();
	        list.add(p1);
	        list.add(p2);
	        list.add(p3);
	       // String json=JsonUtils.listToJson(list);
	        request.setAttribute("data",list);
	        request.getRequestDispatcher("data.jsp").forward(request,response);
	       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
