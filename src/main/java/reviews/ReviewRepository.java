package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	
	public ReviewRepository() {
    
	//Constructor
	Review review = new Review(12345, "London", "/images/Webp.net-resizeimageLondon.jpg", "City", "Fun city, full of history and people. The museums are magical.The food leaves something to be desired but you don't go to London for food.", "March 2001", "London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times.", "tag");
	reviewMap.put(review.getId(),review);
	Review review2 = new Review(12346, "Cancun", "/images/Webp.net-resizeimageCancun.jpg", "Beach", "Mexican town that boasts beautiful beaches and awesome water sports. Be careful tipping. There is a lot of poverty in Cancun and empathy can lead to over tipping and blowing your budget.", "May 2006", "Cancún, a Mexican city on the Yucatán Peninsula bordering the Caribbean Sea, is known for its beaches, numerous resorts and nightlife.", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(12347, "Istanbul", "/images/Webp.net-resizeimageIstanbul.jpg", "City", "A city full of people that holds onto tradition while embracing innovation. I absolutely despised the food in Turkey. I lived off cucumbers and watermelon for almost two weeks when I visited. With that said, the sights were worth the lack of food.", "September 2014", "Istanbul is a major city in Turkey that straddles Europe and Asia across the Bosphorus Strait.", "tag");
	reviewMap.put(review3.getId(),review3);
	Review review4 = new Review(12348, "Helsinki", "/images/Webp.net-resizeimageHelsinki.jpg", "City", "A beautiful city with a great transit system. The people here were so friendly. We stayed at an old circus building, the hotel had loads of character and the transit system was easy to manuever.", "5/7/2012", "Helsinki, Finland’s southern capital, sits on a peninsula in the Gulf of Finland.", "tag");
	reviewMap.put(review4.getId(),review4);
	Review review5 = new Review(12349, "Casablanca", "/images/Webp.net-resizeimageCasablanca.jpg", "City", "A lovely city steeped in tradition. It was awesome to see the mixture of old and new in the city. There were a lot of street vendors offering loads of wares.", "April 2016", "Casablanca is a port city and commercial hub in western Morocco, fronting the Atlantic Ocean.", "tag");
	reviewMap.put(review5.getId(),review5);
	Review review6 = new Review(12350, "Rome", "/images/Webp.net-resizeimageRome.jpg", "City", "Rome has museums and history galore for you to explore. I loved my visit here. The Vatican was breathtaking. I will admit that after staring at the ceiling in the Sistine Chapel I was a little disappointed. There are oodles of people, even in the off season. ", "April 2016	", "Rome, Italy’s capital, is a sprawling, cosmopolitan city with nearly 3,000 years of globally influential art, architecture and culture on display.", "tag");
	reviewMap.put(review6.getId(),review6);
	Review review7 = new Review(12351, "Barbados", "/images/Webp.net-resizeimageBarbados.jpg", "Beach", "Barbados is a delight. Lovely beaches and mesmerizing floral landscapes. Barbados is a great place to visit. The beaches are gorgeous and we were lucky enough to have a breeze that kept us cool in the sun. The monkeys are a draw for tourists, however I was NOT a fan of feeding one. They seemed tame enough, but...um no.", "March 2017	", "Barbados is an eastern Caribbean island and an independent British Commonwealth nation.", "tag");
	reviewMap.put(review7.getId(),review7);
	Review review8 = new Review(12352, "Malaga", "/images/Webp.net-resizeimageMalagaview.jpg", "Beach", "Malaga is a beautiful city with beaches and a nice shopping district. We were able to leisurely walk around and see the city.", "April 2016	", "Málaga is a port city on southern Spain’s Costa del Sol, known for its high-rise hotels and resorts jutting up from yellow-sand beaches.", "tag");
	reviewMap.put(review8.getId(),review8);
	
	
	
	
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long id) {
    	return reviewMap.get(id);
    }
}