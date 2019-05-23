package com.sihai.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2019-05-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
public class AlipayConfig {
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的沙箱环境基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	//支付宝网关
//	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	//商户私钥，您的PKCS8格式RSA2私钥
//	public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCdBii7FdygWuxyvWjFnwa6BiijZiXF2yrC3eFTAPU0ZMh0klaZT/orRT2fnS4Rnac+F5qDp8c/vnLp2Po+O3+aRWJJFBg/9ySDKsOPxIFjyciuse8buB8DaucqY7IppiSZo5luiag6Mz2cFbOPBNHbvh4O7OBSPRhikrKtK+Yg5+Werb49EJEdErLqo2VqHowcwrY6z1krA8vuwOcUzMsr6r8JRDmK6Ae3EseX42Ryhyo6kXksthQbPKxRJnLIV2bLTSoChobC9FE6wRouSFp7+gUA28zsZEP46oXWjkCS+qPDTatAKOl4MnIynEeRc+RC2KUp/7GuSwpZULZUtL8VAgMBAAECggEAcJ6mP+hiILCVvYWTy4lPLcSVCPyOQuX6OWEh5oJdW4KdMt5yNetipf43QG9fR0snVCVhsON4yIMzr/zrHg9WabMx1vAOpHIBQgI92LM7ifKDeKgtslfQBod53LE8axq6TWdE+D7K5VMy8OuvqPfv/AbTUCkcil8/ShOlCwbdOuN35iRd0fxpNL1C19oZf0ZxSw6ZvBh7FVmGEj0hFv2v7EuEDTZ/5XAM7GmFY4F4LC4CmHUfZSUgXqo2L8w+wm2NaHRyuEFebs1qIVqpGe230hg1wKJRyVw69EBXpAnLYueoO7Eo+byDyQH5BGieOCSQvt5nVTwkasSwiIcgbE6c0QKBgQDM43bdx1tHdZTfX/l3I9LAPGyDSUD4vQzmN30RpmXM88EJit/QwSr/pdWzu+sFm6dPYe1Bta5fyg6f8UtlcMZ/77nPAEi59T0CYO4xnvg2ldAgkBHqU/MIYyTf6U2+WA/eu0ozZmn/T9d4DOGyKl6azN35Fvf4Pm+NcAD8X+z7SwKBgQDEMfyfdhD8nWnJOynvLp2egtAKUimJYEeorK5/o8h9EJqOKsmu+xq3stRHs+9UzyD0zQ2deTpCjhPmt+Ygf6ZAmkC/9VgO/JPFXrtupUd1ypVLi9LpswJuO8I6eqzDbhMIooeXxaxd9d58BNLydzYA9lJNgYdKYYnRf1PRHftTHwKBgQCgf4b70FD2t2r5WGtJIuzS3gJ7DYUx1JYoOUtl6h1Q4ZlT6k/NbaRLQxMWipxedkIn8yQyFyoTq2qtbA2N1zwHuDirqSNPWIaEOH4erNLvn4e8Gl+OWljFNzUJme7mroEwDzLe9NkPwPGe/yhFst8NEHLJz25MLkygVR7QlCxF5QKBgExoNz0W6wimeVNQQkWO/v2DbmgGlXyVzXKIRbEZ5POn6rkhOsh1rHMMJxYBolyCChCsZvgEBUd0M5Xv2qSfcezI5hyb/P5hKV99RDuUDJ94FOqF+s7e0zyA82R48B1wGeOMAIiACF/TaCEec9TPzm1TgLwEjN7P26+GCetv5Lf7AoGBALGNDuBSf1cN4KH+F6GqUgD6euZ5EiLxddeOHfso+B3OzxeR4OTLNRpZdg/hgxhExm2r3nXkL9VsWmRtJkXgGRQqqxs003D5/zS291xNXh1rwjHp3bL2OfJz0NvYQlat+sOIHUXtazewuOg8L41qbUC9kgPJKZTqYOwqt7brZbKA";
//	public static String app_id = "2016092800616779";
	//支付宝公钥,查看地址：https://sandbox.alipaydev.com/user/accountDetails.htm?currentBar=1
//	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvtjRxgTf6n0gLUGr+3dBrCgCEGVEWPKVVSFxJ4vv6/0ZFLNI8wH8Qpekh0KEtHP6MZPOXx8fQwRe4n7BhM/V4HnbML6xE64YPrwYG8p2srAIeeUzJo4w+00EZIzwGLO5BbIlVU+85QdshfZWqfiYESkzk0P2deaLty6SCKX2AyDeO99/BC+R111mSFB8KMs6lfP0TOCV5ahoaynEqvs674iE3MsIDzMzFk9MYMKkNEIhk3JR3RVBMiGXX6hHYt726LLEXaT4hOtK8/IZ5WRVmEddqOyEJYcpgajtNjsHyFv+BgUUwm6dTcOrh7P6wNcLAfOFgROnMvtykkUx+ECtTQIDAQAB";
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的正式环境基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	// 支付宝网关：真实网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	public static String app_id = "2019050864335970";
	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCIvqGR50yVZez/6mPPV4tibvEekpd8G2qYYhItE25O8xod46HRVTwSmgjQ+dMAZV7yZfps6CJ5Xmo2dhAHX3AjrIG9i+IRUJbRJvI67VS7moE1RlVTrbL28ObfSYSrHBGI6XuAckFO3QtmiH1iovx79AxDSZ927X3GOfP67o9W0XNgjIw6fvnb3EO5nxH/yR32nQlCI2v5tjnhGw3HWOX5bYlxW68vcs4Z6vyoNaHZHfpPmLAUpSsEN5DM4TAvTULhYYGsTWrp0H/g21Ohf9hs1LZLWos/TrE5JpSoE9cgCQZS9BNDshOKV0/umbVhJi3STYHybWlGcFvwFEiuiWktAgMBAAECggEAXyfwvNws0cWkv402uWEdMHktNu4hlg5qBfIw3ccouq22ndf6kfXzIKqpueou55ajFKDcPA7pdnW6CX3st4S1P03a1rDRtuTSnmawp0rh7M6eXRk9ZUZ5RBftQLIjLQMSPKjk9UQMqDlvpoESZ6IteoAgTG6eFh87p8ZKPnLlsi5196HwwQuBJBOuyXw4UPYE6vteAUmQhAS2711ZK0dDF5ziF+sClzh+q2abPDaBH2xKsXYehLXPaw4KLGnhkl9M8vQQONYhg5DdZFVJwoouF6kZGHTK2lRa0icW0tddaVTx12xriW0x01/6pAzEFuRuxBEbcsHbbf3bX7hXjDhDbQKBgQDTbqX0qd9m5a63VNrIOcSHKKPIlKUZbBCuqnpk2c9sTJRCfX+iRNFqEeGGUf3AbEMUO47OzcZWbRK+BNmc5yiEp43c8W9rl6WwMYbVB0i7a6MK29OWgxd7xF1GNcazUfscK3/VD89GP5U3sFczbp8tTSrPo015vk2wiIUAcztP6wKBgQClka0QRTeBfrmwLaBHegKlw6viCZKiB8sae/fzf6bjNUtVD2pO+VTdFdsMA5cX8AKir1ibuj8vHmhoXA+OxGckdMAvtpIoeBKRMIfC6b8eBvarG2H0ymksStC4zelJdK/Mkb+R1n86y6Blsm7O1KfJTEzlM3uIzprM38XNxZH9RwKBgH51abFCgSosKinhCNJFKvSkLAHmVjE0X2347Sew1s0xqGN0aIiHnLFSbI9ILvuORTiuvqWWkhBTQKiCgh3EbImbJdCGX1v84c7WcIytxKTEpknyXUVitwMB2cAKngPW/thEdDrdL94WXYtnX2CVw4L26qoyRD6SwijaHqK8STdtAoGAY5NsaUenrUsA9HNMXRCFPRqkakpllOto/GGoaxrPzQBFcT/XKO4NWvYFCoGyQmRHwX4BpY7q5zS7iGAtvyhh++v3lfqQhqRITmfIjrI0DiQUAC50yFtfy5KnWy4D6vixri/N7jD5zeufaOpaeCwvSQKJkKNY3ZucQDEo7quvNIsCgYAjJbch94qKmrebm5SUHNBZYOUu6/2Qr3FAfzxg/xxH5VhM6uprSGKtYvlm2ynMf5D/D7hzxIA0J2pdmHKdmF3sxURcliOq8y2h2+dC45IT16XmDOLeEkmCJEyXAb6onfnAVQMVdMtV4eEZm/pA2/8byQMx+tNti2TiE55bCK+b6g==";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs5aj2squMXEENNXytwSJ5Ja6E2xgu3jbx9Skl7Q1tqI0TdtuEhEwsD9fIeUDYFQ5jjpamhR5/azLYcDjjPTr2k26H8WzzaDsvAKQGXW9O389hsCiCaPJrKM9psoj+rqNwuvkEzUahVg3q6MgivRs5amUmdnlfXzk28odn9vXNJzMojTwD6PCuzUjLoAVUjuSVH38RsYqKj1Fg9BDrb7nJFpu1o39K6Xti29GArKGFBLjm4xDCCWBMuxTcZgGdtpCEIPufMjfsZEPZsYq73rISMApZmw7+7ofGMLSx9W9azg+Plz9OW7TwpF9zDnaDopAtixC9B+8dNw9Ze7W/nf1bQIDAQAB/TmWXBlYcgV4fi+dbYBnSafJ8KIPCa0XzRgzmrYNUbhgjQjbnOYcNuKAs6gJeTFNOAQIn5boypnuH4TOnqY0k6LTgeG3Vrs9m1cjcShf6fUVJPOukRffZY+vfybpRiDMIoifcBzoJRIfmUT4gvKNcZ/BtsPpGpCvL4hznyirU4yGdRIuu8x8ECaSAqFcNz8kgo7bfqw9G7Qb8AcLhaJDajqIetwCO9vL6e9ElYFY8Sdyu+qkkIigEuVtES5F7G+wKY8ZM+kqHY12cbn0+u3vXc7VE6wIDAQAB";
	public static String small_app_id = "2019052165279848";
	public static String small_merchant_private_key = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQCsyJKyxbySQ2ze0l8mDcCvLfBULVyllhiuodi5s29Q2mcY0b4RNcKoWL35FHOX5J/ugvSzrJCFNrzIAhhRlp4s8YpGUUUJFmd5BJ1uI4yzRgD21AzrIwAa7YQSNHXd1FgmB5J7dhK95rIv4GJK2EzHnnUQ6wFJ5Gck+E7MS1KVYM+YfZccHcodNRN/0gayc1M/rg44MhVINoGdUz3GjGCJ+2Pat1LOLDq+xA98zmkRtAVHof1lFbl0X5dtD/F9uBwzT3zduUIEGriiEy92rDt+luVW/7hxxrVb0v1k9yUJR5XgkFtTsndDIDEXUgavku+mX+llYCIUy1TE9KoWWZxfAgMBAAECggEBAJ3E378Bs3hSvNyRd3RF5oWPCv2yFgDVF2CORFj8sU5Avxb4nfcVAdO6hG0l8Y7moeqmBU7y6VvaaXKwBwio4XHkdABVQRZVMNJeFmp1Z4pjB4paghlK8lOkQY5l/KI7vOmszGKTo/Vm65mv59CzxRgZZoe2Lo0MU+p8GWeN97CRH4+pDKxnKj1pzM8Ja5e0JxfTZGor5OAQLkWOlIs7GTWhvJwvaQK0sc+aUGMUGty6EkkYna8bEgFrebeM4kzl9ZkzLOqFRlLGtxDVDpNK9zJy9OhB9gMrQ7lyE983Ut396E5aGVIizwPCLWHgXJ7HBD7Vp2iNG5A135JrtKV7tBECgYEA1xI+tSliiM9a7JH1XGgrm3kKFiKPYk8XCJQvd6uL7hQqY+Yb50O3amu1hk5SAi7U0LWpvViOgkWeobEqsgDMM9FtHXhaAgQL7tj8uu+F8ItH0jw8cdYvRVocshYrY1jWKbz9k2ke6LVybHBxODpUhi+16tweVzKxQ/BBAGJufCUCgYEAzaorScsEDd9Rm6uauPM5rs86f/qqiCSFtsRzGneT5aCo/dewLheWJ1yqG3AonVUJj6RyUDiAiYfdg7bRvcPQdVo00zNuQN0472HEPpK6Rdy4guPoTe9xLjEjWaIiK6OxBoLke3XJzf4j+JpT6jm2sclxRJLWXVY7o8+QFUMVDTMCgYEAuI7oju+vpbVC0kXCZwThfu5UcIBByNwT6QG45hmo36ogYk/B3CgpCkLZqCInj8X+TAfIXDrVOAdkRF7TQ6MZmNH7r9Fqc9ZjIxjDb+tBZhUvkcKtIAbr07irbUtG+l7ukSyj8c7AfnPOeC3ZiqXLiMcCdkNkKfHPWnyeWyUcqJ0CgYEApkS3wG3PtkNf36FpcbK5ZJkGa2bErVIRhAPoJnKb793mIWpZdbn9246vu4T+YMvZ8fX5sN8tE4Ly08ReZrNC+UzXPhPrQ6dVmzoIBKpsy4Q46yDDsxYsAzMYqCNKyssImAIEI8fDQbT/ccGaq9bC25LG7rBje4v2pWVtz7Ku9z8CgYEAz0fz+zDhAq+W/WtR+wJp8VQfA95ZEKfMwRh80ud01gikGdhp/4Uq7cDpDqxPGyOdLSfngTGflB3sAIm14m+gQaE4WHgwuiwxpJMTBhqfVvosx8kGeceHCuLkWEZR8R+uTrTF2v/G0nRGKnoNdZIuT2XfmaKSyo6SoJo96u6CPOI=";
	public static String small_alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs5aj2squMXEENNXytwSJ5Ja6E2xgu3jbx9Skl7Q1tqI0TdtuEhEwsD9fIeUDYFQ5jjpamhR5/azLYcDjjPTr2k26H8WzzaDsvAKQGXW9O389hsCiCaPJrKM9psoj+rqNwuvkEzUahVg3q6MgivRs5amUmdnlfXzk28odn9vXNJzMojTwD6PCuzUjLoAVUjuSVH38RsYqKj1Fg9BDrb7nJFpu1o39K6Xti29GArKGFBLjm4xDCCWBMuxTcZgGdtpCEIPufMjfsZEPZsYq73rISMApZmw7+7ofGMLSx9W9azg+Plz9OW7TwpF9zDnaDopAtixC9B+8dNw9Ze7W/nf1bQIDAQAB";

	//↓↓↓↓↓↓↓↓↓↓公共配置↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	public static String adds = "http://quanfuyun.cn";
	public static String autorAddress = "https://openauth.alipay.com/oauth2/appToAppAuth.htm";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = adds+"/mm/alipay/notify.do";
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = adds+"/mm/alipay/returnUrl.do";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";


	// 日志
	public static String log_path = "C:\\";

	public static String dowloadpath = "E:/alipay/"; //账单下载路径


	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/** 
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}



