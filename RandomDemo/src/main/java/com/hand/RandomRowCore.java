package com.hand;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class RandomRowCore {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入随机点名数：");

        int count = sc.nextInt();
        String fileName="E:\\JavaGroup.xlsx";
        getExcelContent(fileName,count);

    }

    static void getExcelContent (String fileName,int count) throws Exception {
        /**
         * 创建文件对象并获取文件流
         */
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook xwb = new XSSFWorkbook(fis);
        fis.close();
        XSSFSheet sheet = xwb.getSheetAt(0);//通过sheet索引获取当前页
        int lastRowIndex = sheet.getLastRowNum();
        if (count>lastRowIndex) {
            System.out.println("输入的数值超过查询范围,自动查询整个表格*^_^*");
            count = lastRowIndex;
        }

        /**
         * 生成指定个数的随机数
         */
        Random rand = new Random();
        int[] array = new int[count];
        Set<Integer> result = new HashSet<Integer>();
        for (int i=0;i<count;i++) {
            int randNum = rand.nextInt(48) + 1;
            if (result.add(randNum)) {
                array[i] = randNum;
            }
            if (array[i] == 0) {
                    i=i-1;
            }
        }

        /**
         * 循环读取表格内容
         */
        for (int rowIndex=1;rowIndex<=lastRowIndex;rowIndex++) {
            XSSFRow row = sheet.getRow(rowIndex);

            XSSFCell sequenceNumCell = row.getCell(0); //序号列
            XSSFCell departmentCell = row.getCell(1); //部门列
            XSSFCell nameCell = row.getCell(2); //姓名列
            XSSFCell sexCell = row.getCell(3); //性别列
            XSSFCell jobNumCell = row.getCell(4); //工号列

            /**
             * 初始化显示的内容
             */
            int seqNumCellInfo = (int) sequenceNumCell.getNumericCellValue();
            String deptCellInfo = departmentCell.getStringCellValue();
            String nameCellInfo = nameCell.getStringCellValue();
            String sexCellInfo = sexCell.getStringCellValue();
            int jobNumCellInfo = (int) jobNumCell.getNumericCellValue();

            StringBuilder deptContent = new StringBuilder();
            deptContent.append("人员信息-->")
                    .append("序号：")
                    .append(seqNumCellInfo)
                    .append(" 部门：")
                    .append(deptCellInfo)
                    .append(" 姓名：")
                    .append(nameCellInfo)
                    .append(" 性别：")
                    .append(sexCellInfo)
                    .append(" 工号：")
                    .append(jobNumCellInfo);

            /**
             * 如果输入的值大于表格的行数，则输出整个表的内容
             */
            if (count == lastRowIndex) {
                System.out.println(deptContent);
            } else {
                 /**
                  * 判断员工序号是否和随机出来的数值相同，相同则输出
                  */
                 for (int index=0;index<array.length;index++) {
                     if (seqNumCellInfo == array[index]) {
                        System.out.println(deptContent);
                     }
                 }
            }
        }
        xwb.close();
    }
}
