package enadev.spring.sfgpetclinic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SfgPetClinicApplicationTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Assertions.assertEquals(2, 1+1, "1 - 1 should equal 2");
	}
}
