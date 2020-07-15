package cn.shp.oa.util;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.domain.Privilege;
import cn.shp.oa.domain.User;

@Component
public class Installer {
	@Resource
	private SessionFactory sessionFactory;
	@Transactional
	public void install() {
		Session session=sessionFactory.getCurrentSession();
		//============================================
		//超级管理员
		User user=new User();
		user.setName("超级管理员");
		user.setPassword(DigestUtils.md5Hex("admin"));
		session.save(user);
		//============================================
		//保存权限数据
		Privilege menu,menu1,menu2,menu3,menu4;
		menu=new Privilege("用户管理",null,null);
		menu1=new Privilege("用户信息","/user_list",menu);
		session.save(menu);
		session.save(menu1);
		//用户的增删改查
		session.save(new Privilege("用户列表","/user_list",menu1));
		session.save(new Privilege("用户添加","/user_add",menu1));
		session.save(new Privilege("用户删除","/user_delete",menu1));
		session.save(new Privilege("用户修改","/user_edit",menu1));
		
		
		menu=new Privilege("设备状态",null,null);
		menu1=new Privilege("状态信息","/role_list",menu);
		session.save(menu);
		session.save(menu1);
		//设备的增删改查
		session.save(new Privilege("设备列表","/role_list",menu1));
		session.save(new Privilege("设备添加","/role_add",menu1));
		session.save(new Privilege("设备删除","/role_delete",menu1));
		session.save(new Privilege("设备修改","/role_edit",menu1));
		
		menu=new Privilege("设备维修",null,null);
		menu1=new Privilege("维修计划","/maintainPlan_list",menu);
		menu2=new Privilege("维修记录","/maintenanceRecords_list",menu);
		menu3=new Privilege("测量室管理","/measureRoom_list",menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		//维修计划的增删改查
		session.save(new Privilege("计划列表","/maintainPlan_list",menu1));
		session.save(new Privilege("计划添加","/maintainPlan_add",menu1));
		session.save(new Privilege("计划删除","/maintainPlan_delete",menu1));
		session.save(new Privilege("计划修改","/maintainPlan_edit",menu1));
		//维修记录的增删改查
		session.save(new Privilege("记录列表","/maintenanceRecords_list",menu2));
		session.save(new Privilege("记录添加","/maintenanceRecords_add",menu2));
		session.save(new Privilege("记录删除","/maintenanceRecords_delete",menu2));
		session.save(new Privilege("记录修改","/maintenanceRecords_edit",menu2));
		//测量室的增删改查
		session.save(new Privilege("测量室列表","/measureRoom_list",menu3));
		session.save(new Privilege("测量室添加","/measureRoom_add",menu3));
		session.save(new Privilege("测量室删除","/measureRoom_delete",menu3));
		session.save(new Privilege("测量室修改","/measureRoom_edit",menu3));
		//保养计划
		menu=new Privilege("设备保养",null,null);
		menu1=new Privilege("保养计划","/maintenancePlan_list",menu);
		session.save(menu);
		session.save(menu1);
		//测量室的增删改查
				session.save(new Privilege("保养计划列表","/maintenancePlan_list",menu3));
				session.save(new Privilege("保养计划添加","/maintenancePlan_add",menu3));
				session.save(new Privilege("保养计划删除","/maintenancePlan_delete",menu3));
				session.save(new Privilege("保养计划修改","/maintenancePlan_edit",menu3));
		//库存管理
		menu=new Privilege("库存管理",null,null);
		menu1=new Privilege("库存总量","/totalInventory_list",menu);
		menu2=new Privilege("出库管理","/outboundManagement_list",menu);
		menu3=new Privilege("入库管理","/warehouseManagement_list",menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		//库存总量的增删改查
		session.save(new Privilege("物品列表","/totalInventory_list",menu1));
		session.save(new Privilege("物品添加","/totalInventory_add",menu1));
		session.save(new Privilege("物品删除","/totalInventory_delete",menu1));
		session.save(new Privilege("物品修改","/totalInventory_edit",menu1));
		//出库管理的增删改查
		session.save(new Privilege("物品列表","/outboundManagement_list",menu2));
		session.save(new Privilege("物品添加","/outboundManagement_add",menu2));
		session.save(new Privilege("物品删除","/outboundManagement_delete",menu2));
		session.save(new Privilege("物品修改","/outboundManagement_edit",menu2));
		//入库管理的增删改查
		session.save(new Privilege("物品列表","/warehouseManagement_list",menu3));
		session.save(new Privilege("物品添加","/warehouseManagement_add",menu3));
		session.save(new Privilege("物品删除","/warehouseManagement_delete",menu3));
		session.save(new Privilege("物品修改","/warehouseManagement_edit",menu3));
		//TPM
		menu=new Privilege("TPM",null,null);
		menu1=new Privilege("TPM日表","/day_list",menu);
		menu2=new Privilege("TPM周图","/week_list",menu);
		menu3=new Privilege("TPM月表","/month_list",menu);
		menu4=new Privilege("TPM问题追踪表","/problem_list",menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		session.save(menu4);
	}
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Installer installer=(Installer)ac.getBean("installer");
        installer.install();
	}

}