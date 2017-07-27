/*
 * 文件名：InitCityServlet.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月12日
 */

package cn.bonc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bonc.entity.City;
import cn.bonc.entity.Province;
import cn.bonc.utils.JsonUtils;
@WebServlet("/initCity")
public class InitCityServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public InitCityServlet() {
        super();
    }
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println(request.getParameter("username"));
       String pid = request.getParameter("pid");
       System.out.println("接收到请求...");
       City c1 = new City();
       City c2 = new City();
       City c3 = new City();
       if (pid.equals("1")) {
           c1.setId(1);
           c1.setName("济南");
           c2.setId(2);
           c2.setName("威海");
           c3.setId(3);
           c3.setName("青岛");
        
       }else if (pid.equals("2")) {
           c1.setId(1);
           c1.setName("石家庄");
           c2.setId(2);
           c2.setName("邢台");
           c3.setId(3);
           c3.setName("唐山");
        
       }else if (pid.equals("3")){
           c1.setId(1);
           c1.setName("崇文区");
           c2.setId(2);
           c2.setName("宣武区");
           c3.setId(3);
           c3.setName("大兴区");
        
       }
       List<City> list = new ArrayList<City>();
       list.add(c1);
       list.add(c2);
       list.add(c3);
       String json=JsonUtils.listToJson(list);
       request.setAttribute("data",json);
       request.getRequestDispatcher("data.jsp").forward(request,response);
       
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request, response);
   }
}
