package lesson5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public AppData(){
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(rowToString(header));

            for (Integer[] row : data) {
                writer.write(rowToString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String rowToString(T[] row) {
        String result = "";

        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        result += "\n";
        return result;
    }

    public void take(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split(";");
            ArrayList<Integer[]> list = new ArrayList<>();
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                list.add(stringToDataRow(temp));
            }
            data = list.toArray(new Integer[][]{{}});
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");


        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }
    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }
}