package vrproject_nb;

//Here you import Watson Java SDK to make it available in your code.
import com.ibm.watson.developer_cloud.visual_recognition.v3.*;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.*;

public class ClassifyImage {

	public static void main(String[] args) {
		VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setEndPoint("https://gateway-a.watsonplatform.net/visual-recognition/api");
		//Here you replace "your_api_key_here" by the API Key you created in "Creating 
		//a Watson VisualRecognition service instance and getting the API key
		service.setApiKey("fb699315c76a28e2cc757958f6dd5ad157d7cd28");
		//Here you add the URL of your image. The image size should not exceed 2MB.
		String imageURL = new
		String("https://raw.githubusercontent.com/watson-developer-cloud/doc-tutorial-downloads/master/visual-recognition/fruitbowl.jpg");
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder().url(imageURL).build();
		Object result = service.classify(options).execute(); 
		System.out.println("Classification Results:");
		System.out.println(result);

	}

}
