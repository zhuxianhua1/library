package libraryTest;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hua.library.entity.Tb_manager;
import com.hua.library.service.LibraryService;

public class TestMysql {

	@Test
	public void test() throws SQLException{
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-mybatis.xml");
		//DataSource datasource = (DataSource) ctx.getBean("dataSource");
		//System.out.println(datasource.getConnection());
		LibraryService libraryService = (LibraryService) ctx.getBean("libraryService");
		String str = "java1234";
		String pas ="1";
		//System.out.println(libraryService.obtionGetname(3));
		Tb_manager obj = new Tb_manager();
		obj.setName("java1234");
		obj.setPwd("1234");
		Tb_manager tb_manager = libraryService.getUserPaw(obj);
		
			//System.out.println(tb_manager.getName());
			if(str.equals(tb_manager.getName())){
				System.out.println(tb_manager.getName());
			}else{
				System.out.println("22222");
				System.out.println(tb_manager.getName());
			}
			if(pas.equals(tb_manager.getPwd())){
				System.out.println(tb_manager.getPwd());
			}else{
				System.out.println("11111111");
			}
	}
	
}
