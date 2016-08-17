package bellhop;

import bellhop.domain.Make;
import bellhop.domain.Van;
import bellhop.repository.MakeRepository;
import bellhop.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProWebServiceApplication implements CommandLineRunner {

	@Autowired
	private VanRepository mVanRepository;

    @Autowired
    private MakeRepository mMakeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProWebServiceApplication.class, args);
	}


    @Override
    public void run(String... strings) throws Exception {

        Make[] makes = new Make[3];
        makes[0] = new Make("Benz");
        makes[1] = new Make("Dodge");
        makes[2] = new Make("Ford");

        mMakeRepository.save(Arrays.asList(makes));

        Van[] vans = new Van[5];
        vans[0] = new Van(makes[0], "name1", "desc", "image");
        vans[1] = new Van(makes[0], "name1", "desc", "image");
        vans[2] = new Van(makes[1], "name1", "desc", "image");
        vans[4] = new Van(makes[1], "name1", "desc", "image");
        vans[4] = new Van(makes[2], "name1", "desc", "image");

        mVanRepository.save(Arrays.asList(vans));


    }


}
