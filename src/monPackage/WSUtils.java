package monPackage;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class WSUtils {

	public static void main(String[] args) {

//		MessageBean messageBean = new MessageBean("Slt la team gros zboub");
//		MessageBean messageBean2 = new MessageBean("coucou turlute");
//		MessageBean messageBean3 = new MessageBean("je suis en retard");
//		MessageBean messageBean4 = new MessageBean("hier je suis allé au cinema");
//		MessageBean messageBean5 = new MessageBean("j'ai rencontré sophie");
//		MessageBean messageBean6 = new MessageBean("elle avait un bikini");
//		MessageBean messageBean7 = new MessageBean("j'ai vu le film avanger");
		try {
//			testWS();
//			sendMessage(messageBean);
//			sendMessage(messageBean2);
//			sendMessage(messageBean3);
//			sendMessage(messageBean4);
//			sendMessage(messageBean5);
//			sendMessage(messageBean6);
//			sendMessage(messageBean7);
			for (MessageBean message : recoverMsg()) {
				System.out.println(message.getContenu());
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static final String URL = "http://192.168.20.5:8080/TchatServer/rest/monService";

	public static void testWS() throws Exception {

		String stringRecu = OkHttpUtils.sendGetOkHttpRequest(URL + "/helloWorld");
		System.out.println(stringRecu);
	}

	private static final Gson GSON = new Gson();

	public static void sendMessage(MessageBean messageBean) throws Exception {
		String json = GSON.toJson(messageBean);

		OkHttpUtils.sendPostOkHttpRequest(URL + "/envoieMsg", json);

	}

	public static ArrayList<MessageBean> recoverMsg() throws Exception {

		Gson gson = new Gson();
		String jsonRecu = OkHttpUtils.sendPostOkHttpRequest(URL + "/recupMsg", "");

		ArrayList<MessageBean> list = gson.fromJson((jsonRecu), new TypeToken<ArrayList<MessageBean>>() {
		}.getType());

		return list;

	}

}
