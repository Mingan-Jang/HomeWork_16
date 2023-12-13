import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        File myDir = new File("C:\\myDir");
        if (!myDir.exists()) {
            myDir.mkdirs();
        }
        File disk = new File("C:\\");
        String[] folderList = disk.list();
        for (int i = 0; i < folderList.length; i++) {
            System.out.println(folderList[i]);
        }

        for (String s1 : folderList) {
            if (s1.contains("myDir")) {
                System.out.println(s1);
            }
        }
        File[] filesList = disk.listFiles();
        for (File s1 : filesList) {
            System.out.println(s1.getAbsolutePath());
        }

        System.out.println("============");
        File myFile = new File(myDir, "myTxt.txt");
        if (!myFile.exists()) {
            try {
                boolean fileCreated = myFile.createNewFile();
                if (!fileCreated) {
                    System.out.println("無法建立檔案");
                } else {
                    System.out.println("建立檔案");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // myFile.delete();
        System.out.println("============");
        System.out.println(disk.getParent());
        if (disk.getParent() == null) {
            System.out.println("Disk cannot get parent path");
        }
        System.out.println(disk.getName());
        if (disk.getName().length() == 0) {
            System.out.println("Disk has no getName()");
        }
    }
}
