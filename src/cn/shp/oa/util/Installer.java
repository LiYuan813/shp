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
		//��������Ա
		User user=new User();
		user.setName("��������Ա");
		user.setPassword(DigestUtils.md5Hex("admin"));
		session.save(user);
		//============================================
		//����Ȩ������
		Privilege menu,menu1,menu2,menu3,menu4;
		menu=new Privilege("�û�����",null,null);
		menu1=new Privilege("�û���Ϣ","/user_list",menu);
		session.save(menu);
		session.save(menu1);
		//�û�����ɾ�Ĳ�
		session.save(new Privilege("�û��б�","/user_list",menu1));
		session.save(new Privilege("�û����","/user_add",menu1));
		session.save(new Privilege("�û�ɾ��","/user_delete",menu1));
		session.save(new Privilege("�û��޸�","/user_edit",menu1));
		
		
		menu=new Privilege("�豸״̬",null,null);
		menu1=new Privilege("״̬��Ϣ","/role_list",menu);
		session.save(menu);
		session.save(menu1);
		//�豸����ɾ�Ĳ�
		session.save(new Privilege("�豸�б�","/role_list",menu1));
		session.save(new Privilege("�豸���","/role_add",menu1));
		session.save(new Privilege("�豸ɾ��","/role_delete",menu1));
		session.save(new Privilege("�豸�޸�","/role_edit",menu1));
		
		menu=new Privilege("�豸ά��",null,null);
		menu1=new Privilege("ά�޼ƻ�","/maintainPlan_list",menu);
		menu2=new Privilege("ά�޼�¼","/maintenanceRecords_list",menu);
		menu3=new Privilege("�����ҹ���","/measureRoom_list",menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		//ά�޼ƻ�����ɾ�Ĳ�
		session.save(new Privilege("�ƻ��б�","/maintainPlan_list",menu1));
		session.save(new Privilege("�ƻ����","/maintainPlan_add",menu1));
		session.save(new Privilege("�ƻ�ɾ��","/maintainPlan_delete",menu1));
		session.save(new Privilege("�ƻ��޸�","/maintainPlan_edit",menu1));
		//ά�޼�¼����ɾ�Ĳ�
		session.save(new Privilege("��¼�б�","/maintenanceRecords_list",menu2));
		session.save(new Privilege("��¼���","/maintenanceRecords_add",menu2));
		session.save(new Privilege("��¼ɾ��","/maintenanceRecords_delete",menu2));
		session.save(new Privilege("��¼�޸�","/maintenanceRecords_edit",menu2));
		//�����ҵ���ɾ�Ĳ�
		session.save(new Privilege("�������б�","/measureRoom_list",menu3));
		session.save(new Privilege("���������","/measureRoom_add",menu3));
		session.save(new Privilege("������ɾ��","/measureRoom_delete",menu3));
		session.save(new Privilege("�������޸�","/measureRoom_edit",menu3));
		//�����ƻ�
		menu=new Privilege("�豸����",null,null);
		menu1=new Privilege("�����ƻ�","/maintenancePlan_list",menu);
		session.save(menu);
		session.save(menu1);
		//�����ҵ���ɾ�Ĳ�
				session.save(new Privilege("�����ƻ��б�","/maintenancePlan_list",menu3));
				session.save(new Privilege("�����ƻ����","/maintenancePlan_add",menu3));
				session.save(new Privilege("�����ƻ�ɾ��","/maintenancePlan_delete",menu3));
				session.save(new Privilege("�����ƻ��޸�","/maintenancePlan_edit",menu3));
		//������
		menu=new Privilege("������",null,null);
		menu1=new Privilege("�������","/totalInventory_list",menu);
		menu2=new Privilege("�������","/outboundManagement_list",menu);
		menu3=new Privilege("������","/warehouseManagement_list",menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		//�����������ɾ�Ĳ�
		session.save(new Privilege("��Ʒ�б�","/totalInventory_list",menu1));
		session.save(new Privilege("��Ʒ���","/totalInventory_add",menu1));
		session.save(new Privilege("��Ʒɾ��","/totalInventory_delete",menu1));
		session.save(new Privilege("��Ʒ�޸�","/totalInventory_edit",menu1));
		//����������ɾ�Ĳ�
		session.save(new Privilege("��Ʒ�б�","/outboundManagement_list",menu2));
		session.save(new Privilege("��Ʒ���","/outboundManagement_add",menu2));
		session.save(new Privilege("��Ʒɾ��","/outboundManagement_delete",menu2));
		session.save(new Privilege("��Ʒ�޸�","/outboundManagement_edit",menu2));
		//���������ɾ�Ĳ�
		session.save(new Privilege("��Ʒ�б�","/warehouseManagement_list",menu3));
		session.save(new Privilege("��Ʒ���","/warehouseManagement_add",menu3));
		session.save(new Privilege("��Ʒɾ��","/warehouseManagement_delete",menu3));
		session.save(new Privilege("��Ʒ�޸�","/warehouseManagement_edit",menu3));
		//TPM
		menu=new Privilege("TPM",null,null);
		menu1=new Privilege("TPM�ձ�","/day_list",menu);
		menu2=new Privilege("TPM��ͼ","/week_list",menu);
		menu3=new Privilege("TPM�±�","/month_list",menu);
		menu4=new Privilege("TPM����׷�ٱ�","/problem_list",menu);
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