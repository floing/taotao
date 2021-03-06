/**
 * 
 */
package taotao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.taotao.model.Item;
import com.taotao.model.User;
import com.taotao.service.ItemServiceI;
import com.taotao.service.UserServiceI;

/**
 * @author HuangQinJian ����3:13:07 2017��3��28��
 */
public class TestMybatis {
	private ApplicationContext ac;
	private UserServiceI userService;

	private ItemServiceI itemService;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml",
				"spring-mybatis.xml" });
		userService = (UserServiceI) ac.getBean("userService");
		itemService = (ItemServiceI) ac.getBean("itemService");
	}

	@Test
	public void test1() {
		Long l = (long) 7;
		User u = userService.getUserById(l);
		System.out.println(l);
		System.out.println(u);
		System.out.println(u.getPassword());
		System.out.println(u.getPhone());
	}

	@Test
	public void test2() {
		Long l = (long) 536563;
		Item item = itemService.getItemById(l);
		System.out.println(l);
		System.out.println(item);
		System.out.println(item.getPrice());
		System.out.println(item.getNum());
	}
}
