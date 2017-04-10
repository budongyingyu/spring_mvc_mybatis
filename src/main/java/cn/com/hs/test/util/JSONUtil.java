package cn.com.hs.test.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

public class JSONUtil {
	public final static ObjectMapper mapper = new ObjectMapper();
	/**
	 * 将json数组转换为list集合
	 * @author: 李海宁
	 * @param <T>
	 * @date: 2015年11月12日 下午2:22:13
	 * @param String json json字符串
	 * @param classes 要转换的java类型
	 * @return List
	 * @throws JsonParseException json转换异常
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> List<T> json2List(String json,Class<?> classes) throws JsonParseException, JsonMappingException, IOException{
		JavaType javaType = getCollectionType(ArrayList.class, classes); 
		List<T> lst =  mapper.readValue(json, javaType);
		return lst; 
	}
	public static <T> T jsonToJavaBean(String json,Class<T> mainClass) throws Exception{
		return mapper.readValue(json,mainClass);
	}
	/**   
     * 获取泛型的Collection Type  
     * @param collectionClass 泛型的Collection   
     * @param elementClasses 元素类   
     * @return JavaType Java类型   
     * @since 1.0   
     */   
 public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {   
     return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
 }
 /**
  * 将json字符串转换为json对象
  * @author: 李海宁
  * @date: 2015年12月2日 下午3:12:34
  * @param jsonStr json字符串
  * @return JsonNode json对象
  * @throws JsonProcessingException
  * @throws IOException
  */
 public static JsonNode jsonStrToJsonNode(String jsonStr) throws JsonProcessingException, IOException{
	 JsonNode jsonNode = mapper.readTree(jsonStr);
	 return jsonNode;
 }
 /**
  * json字符串转map
  * @author: 李海宁
  * @date: 2015年12月3日 下午3:42:57
  * @param jsonStr json字符串
  * @return  Map《String，String》
 * @throws IOException 
 * @throws JsonMappingException 
 * @throws JsonParseException 
  */
 public static Map<String,String> jsonToMap(String jsonStr) throws JsonParseException, JsonMappingException, IOException{
	@SuppressWarnings("unchecked")
	Map<String,String> map = mapper.readValue(jsonStr, Map.class);
	 return map;
 }
 /**
  * java对象转json字符串
  * @author: 李海宁
  * @date: 2015年12月22日 下午3:26:45
  * @param obj java对象
  * @return json字符串
  * @throws Exception
  */
	public static String javaBeanToJson(Object obj) throws Exception{
		return mapper.writeValueAsString(obj);
	}
}
