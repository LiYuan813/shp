package cn.shp.oa.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.WarehouseManagementDao;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.WarehouseManagement;
import cn.shp.oa.service.WarehouseManagementService;


@Service
@Transactional
public class WarehouseManagementServiceImpl extends BaseDaoImpl<WarehouseManagement> implements WarehouseManagementService{

	@Resource
	private  WarehouseManagementDao  warehouseManagementDao;
	@Override
	public List<WarehouseManagement> findAll() {
		
		return warehouseManagementDao.findAll();
	}

	@Override
	public void save(WarehouseManagement model) {
		warehouseManagementDao.save(model);
		
	}

	@Override
	public WarehouseManagement getById(Long id) {
		
		return warehouseManagementDao.getById(id);
	}

	@Override
	public void update(WarehouseManagement warehouseManagement) {
		warehouseManagementDao.update(warehouseManagement);
		
	}

	@Override
	public void delete(Long id) {
		warehouseManagementDao.delete(id);
	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM WarehouseManagement")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		if(list==null) {System.out.println("异常信息：没有获取list");}
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM WarehouseManagement").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}
//导入表格
	@Override
	public void readExcelData(String excelPath) {
		try {	
			File file = new File(excelPath);
			InputStream inputStream = new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet=workbook.getSheetAt(0);
			for(int i=1;i<sheet.getLastRowNum()+1;i++){//循环Excel工作表的行，并读取单元格数据
				WarehouseManagement warehouseManagement=new WarehouseManagement();
				Row row=sheet.getRow(i);
				for(int j=0;j<17;j++) {		
					Cell cell=row.getCell(j);
					if(cell!=null)
                    {
						if(j==11||j==16) 
						{
							if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
							{
								 long longVal = Math.round(cell.getNumericCellValue());  
								 double doubleVal=cell.getNumericCellValue();
								 SimpleDateFormat sdf = null;
								 if(DateUtil.isCellDateFormatted(cell))// 判断单元格是否属于日期格式  
									{
									 sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									 Date date = cell.getDateCellValue(); 
									 cell.setCellValue(sdf.format(date));
									}
								 else if(Double.parseDouble(longVal + ".0") == doubleVal)//double 型
								    	cell.setCellValue(longVal);  
								      else  
								    	cell.setCellValue(doubleVal);   
							}
						}
						else
							cell.setCellType(Cell.CELL_TYPE_STRING);
					  switch(j) {
					  case 0: warehouseManagement.setTypesOfGoods(cell.getStringCellValue()); break;
					  case 1: warehouseManagement.setName(cell.getStringCellValue()); break;
					  case 2: warehouseManagement.setSpecification(cell.getStringCellValue()); break;
					  case 3: warehouseManagement.setModel(cell.getStringCellValue()); break;
					  case 4: warehouseManagement.setBrand(cell.getStringCellValue()); break;
					  case 5: warehouseManagement.setOrderNumber(cell.getStringCellValue()); break;
					  case 6: warehouseManagement.setNumberOfRecipients(cell.getStringCellValue()); break;
					  case 7: warehouseManagement.setUnit(cell.getStringCellValue()); break;
					  case 8: warehouseManagement.setTermOfValidity(cell.getStringCellValue()); break;
					  case 9: warehouseManagement.setWarningQuantity(cell.getStringCellValue()); break;
					  case 10: warehouseManagement.setStorageLocation(cell.getStringCellValue()); break;
					  case 11: warehouseManagement.setDate(cell.getStringCellValue()); break;
					  case 12: warehouseManagement.setDeliverer(cell.getStringCellValue()); break;
					  case 13: warehouseManagement.setReceiver(cell.getStringCellValue()); break;
					  case 14: warehouseManagement.setOperator(cell.getStringCellValue()); break;
					  case 15: warehouseManagement.setGoodsId(cell.getStringCellValue()); break;
					  case 16: warehouseManagement.setTotalPrice(cell.getNumericCellValue()); break;//商品总价应该是double型的
					  }
                    }else {
                    	row.createCell(j);
                    }				
				}
				save(warehouseManagement);
			}
		}catch(Exception e){
			System.out.println("异常信息："+e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void readDataToExcelFile(String filePath, String fileName,
			List<WarehouseManagement> warehouseManagementList) {

try {
	

		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet();
		for(int i=0;i<warehouseManagementList.size();i++)
		{
			WarehouseManagement warehouseManagement=(WarehouseManagement)warehouseManagementList.get(i);//遍历保存数据对象的集合
			HSSFRow dataRow=sheet.createRow(i);
			HSSFCell typesOfGoods=dataRow.createCell(0);
			typesOfGoods.setCellValue(warehouseManagement.getTypesOfGoods());
			HSSFCell name=dataRow.createCell(1);
			name.setCellValue(warehouseManagement.getName());		
			HSSFCell specification=dataRow.createCell(2);
			specification.setCellValue(warehouseManagement.getSpecification());
			HSSFCell model=dataRow.createCell(3);
			model.setCellValue(warehouseManagement.getModel());
			HSSFCell brand=dataRow.createCell(4);
			brand.setCellValue(warehouseManagement.getBrand());
			HSSFCell orderNumber=dataRow.createCell(5);
			orderNumber.setCellValue(warehouseManagement.getOrderNumber());
			HSSFCell numberOfRecipients=dataRow.createCell(6);
			numberOfRecipients.setCellValue(warehouseManagement.getNumberOfRecipients());
			HSSFCell unit=dataRow.createCell(7);
			unit.setCellValue(warehouseManagement.getUnit());
			HSSFCell termOfValidity=dataRow.createCell(8);
			termOfValidity.setCellValue(warehouseManagement.getTermOfValidity());
			HSSFCell warningQuantity=dataRow.createCell(9);
			warningQuantity.setCellValue(warehouseManagement.getWarningQuantity());
			HSSFCell storageLocation=dataRow.createCell(10);
			storageLocation.setCellValue(warehouseManagement.getStorageLocation());
			HSSFCell date=dataRow.createCell(11);
			date.setCellValue(warehouseManagement.getDate());
			HSSFCell deliverer=dataRow.createCell(12);
			deliverer.setCellValue(warehouseManagement.getDeliverer());
			HSSFCell receiver=dataRow.createCell(13);
			receiver.setCellValue(warehouseManagement.getReceiver());		
			HSSFCell operator=dataRow.createCell(14);
			operator.setCellValue(warehouseManagement.getOperator());
			HSSFCell goodsId=dataRow.createCell(15);
			goodsId.setCellValue(warehouseManagement.getGoodsId());
			HSSFCell totalPrice=dataRow.createCell(16);
			totalPrice.setCellValue(warehouseManagement.getTotalPrice());
		}
		File xlsFile=new File(filePath+fileName);
		FileOutputStream fos= new FileOutputStream(xlsFile);
		workbook.write(fos);
		fos.close();

	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
