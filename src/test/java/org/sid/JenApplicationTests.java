package org.sid;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenApplicationTests {

	@Test
	void AssertThatOnePlusOneIsT() {
		int somme=1+2;
		assertThat(somme).isNotNull();
		assertThat(somme).isEqualTo(2);
	}
	
	@Test
	void AssertThatOnePlusTwoIsThree() {
		int s=2+1;
		assertThat(s).isNotNull();
		assertThat(s).isEqualTo(2);
		
	}

}
