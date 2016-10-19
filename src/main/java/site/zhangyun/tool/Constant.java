package site.zhangyun.tool;
import android.os.Environment;
/**
 * 该类主要是文件的配置类
 * Created by zhangyun on 2015/7/6.
 * Email:2488234525@qq.com
 */
public class Constant {

	/**
	 * web端接口请求地址(测试)
	 */
	//public final static String httpRequest="http://test1.hitheone.com/api";
	/**
	 * web端接口请求地址(正式)
	 */
	public final static String httpRequest="http://api.hitheone.com/api";
	/**
	 * web端文件下载地址
	 */
	private static String httpDownloadApk = httpRequest+"upload/fileVersion/";
	/**
	 * 是否开启debug模式
	 */
	public static final boolean DEBUG=false;
	/**
	 * SD卡的存储路径
	 */
	private final static String  sdpath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
	/**
	 * 应用存在sd卡的路径
	 */
	public  final static String  mSavePath = sdpath + "TheOne/";

	/**
	 * 获取要下载的文件的地址
	 * @param name 文件的名称
	 * @return  字符串类型的文件地址
	 */
	public static String getDownLoadFile(String name){
		return httpDownloadApk +name ;
	}

}
