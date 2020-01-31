package utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CellValues  {

	int rows_total;
	DataRead dataSheet = null;
	//List<DataRead> dataSheetList = new ArrayList<DataRead>();
	Row row = null;
	XSSFCell cell= null;

	///---------------------UBL Credential Cell Values---------------//
	public List<DataRead> LoginData (String filePath,String sheetName) throws Exception{
		List<DataRead> dataSheetList = new ArrayList<DataRead>();
		FileInputStream inputStream = new FileInputStream (filePath);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		rows_total = sheet.getLastRowNum();
		for (int i=1;i<=rows_total;i++){
			row = sheet.getRow(i);
			dataSheet = new DataRead();
			cell = (XSSFCell) row.getCell(0);cell.setCellType(CellType.STRING);dataSheet.setUserName(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(1);cell.setCellType(CellType.STRING);dataSheet.setPassword(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(2);cell.setCellType(CellType.STRING);dataSheet.setNickName(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(3);cell.setCellType(CellType.STRING);dataSheet.setBalance(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(4);cell.setCellType(CellType.STRING);dataSheet.setCNIC(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(5);cell.setCellType(CellType.STRING);dataSheet.setNumber(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(6);cell.setCellType(CellType.STRING);dataSheet.setEmail(cell.getStringCellValue());
			dataSheetList.add(dataSheet);
		}
		return dataSheetList;	
	}


//	public List<DataRead> ExchangerData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){ 
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTaxPayerName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setExchangerFirstName(cell.getStringCellValue());
//
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//
//	public List<DataRead> UserData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setFirstName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setLastName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTitle(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setEmail(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setPhoneNumber(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setFaxNumber(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//
//	public List<DataRead> ReferralData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferralType(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferralCompany(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferralName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferralNotes(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferralState(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferralRate(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(6);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTIN(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//
//	public List<DataRead> ExchangeState (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setExchangePropertyState(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//
//	public List<DataRead> SalePropertyData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setDescription(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTransferDate(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setContractPrice(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setQIFunds(cell.getStringCellValue());
//			
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public List<DataRead> UpdateSalePropertyData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setDescription(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTransferDate(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setContractPrice(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setQIFunds(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAdminJustification(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public List<DataRead> BuyerData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerAddress(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerCity(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerState(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerZipCode(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerPhone(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(6);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerEmail(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(7);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBuyerFax(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public List<DataRead> PropertyContractDetailData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setPropertyContractDate(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setOwnershipPercentage(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setNickName(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	///---------------------BA Cell Values---------------//
//
//	public List<DataRead> PropertyCollectibaleFeeData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setThresholdTier1(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setThresholdTier2(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setThresholdTier3(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setThresholdTier4(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setThresholdTier5(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAmountTier1(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(6);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAmountTier2(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(7);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAmountTier3(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(8);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAmountTier4(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(9);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAmountTier5(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(10);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setFirstReplacementFee(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(11);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAdditonalReplacementFee(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(12);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setEscrowFee(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(13);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setDisbursmentFee(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public List<DataRead> HouseAccountData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setHouseAccount(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public  List<DataRead> HouseAccountBalance (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setHouseAccountBalance(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBalanceEffectiveDate(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	}
//
//	public List<DataRead> MasterBankData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setMasterBankAccountName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setAccountNo(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setABA(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setACH(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setNote(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setCity(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(6);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setState(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(7);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setWireAttn(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(8);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setHouseAccountName(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	// Client User//
//
//	public List<DataRead> PropertyDescription (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setPropertyDescription(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public List<DataRead> PurchasePropertyData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setPropertyDescription(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTransferDate(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setContractPrice(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setState(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		}
//		return dataSheetList;	
//	}
//
//	public List<DataRead> SellerData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		for (int i=1;i<=rows_total;i++){
//			row = sheet.getRow(i);
//			dataSheet = new DataRead();
//			cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerName(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerAddress(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerCity(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerState(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerZipCode(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerPhone(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(6);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerEmail(cell.getStringCellValue());
//			cell = (XSSFCell) row.getCell(7);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerFax(cell.getStringCellValue());
//			dataSheetList.add(dataSheet);
//		} 
//		return dataSheetList;	
//	}
//
//	//Starting index is 1 as header occupies 0 index
//	public  List<DataRead> SearchExchangerData (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTaxPayerName(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	}
//
//	public  List<DataRead> CreateFundData (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTransferDate(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(1);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setContractPrice(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setQIFunds(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(3);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setReferenceNo(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(4);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBankAccount(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(5);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setFrom(cell.getStringCellValue());
//		cell = (XSSFCell) row.getCell(6);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBankNote(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	}
//
//	public  List<DataRead> SellerName (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setSellerName(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	} 
//
//	public  List<DataRead> TransferDate (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setTransferDate(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	} 
//
//	public  List<DataRead> FundAmount (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(2);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setContractPrice(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	} 
//
//	public  List<DataRead> BankHolidayDate (String filePath,String sheetName, int index) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		rows_total = sheet.getLastRowNum();
//		row = sheet.getRow(index);
//		dataSheet = new DataRead();
//		cell = (XSSFCell) row.getCell(0);cell.setCellType(Cell.CELL_TYPE_STRING);dataSheet.setBankHoliday(cell.getStringCellValue());
//		dataSheetList.add(dataSheet);
//		return dataSheetList;
//	} 
//	
//	public void ExcelReportData (String filePath,String sheetName) throws Exception{
//		List<DataRead> dataSheetList = new ArrayList<DataRead>();
//		FileInputStream inputStream = new FileInputStream (filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(sheetName);
//		int i=13;
//		i++;
//		String DateFormat1;
//		DataFormatter formatter = new DataFormatter();
//		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
//		int CurrentMonth = calendar.get(Calendar.MONTH)+1;
//		XSSFCell cell = sheet.getRow(i).getCell(0);
//		String dateFormat1 = formatter.formatCellValue(cell);
//	
//		if(dateFormat1 != "Other Receipts & Disbursements") {
//		String[] dateFormat2 = dateFormat1.split("/");
//
//		for (String date : dateFormat2) 
//		{
//			int Date = Integer.parseInt(dateFormat2[1]);
//			int Date1 = Integer.parseInt(dateFormat2[0]);
//			//if the date falls out of the range of month
//			if(Date1!=CurrentMonth) 
//			{
//				System.out.println("Report Date is not with in selected range");
//				break;
//			}
//			else 
//			{
//				if (Date>28 || Date<1) 
//				{
//					System.out.println("Report Date is not with in selected range");
//					break;
//				}
//				else
//				{
//					System.out.println("Report Date is with in selected range");
//					break;
//				}
//			  }
//		}
//	}
		//return dataSheetList;
}
	
