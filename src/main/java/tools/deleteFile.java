package tools;

import java.io.File;

public class deleteFile {
	private String path=null;
	
	public deleteFile(String path) {
		this.path=path;
	}
	
	public void doDelete() {
		File file=new File(path);
		File[] fs =file.listFiles();
		if(fs.length>0){
			for(File f:fs) {
				if(f.getName().contains("jpg"))
					f.delete();
				System.out.println("截图已全部删除");
			}
		}else {
			System.out.println("当前没有图片");
		}
		
	}
	
	public static void main(String[] args) {
		deleteFile file=new deleteFile("E:\\works\\kerr\\test-output\\screenshotpicture");
		file.doDelete();
	}
}
