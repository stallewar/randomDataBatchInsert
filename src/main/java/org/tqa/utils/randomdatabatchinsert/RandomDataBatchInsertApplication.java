package org.tqa.utils.randomdatabatchinsert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class RandomDataBatchInsertApplication {

	public RandomDataBatchInsertApplication(RandomDataBatchInsertGeneratorService randomDataBatchInsertGenerator) throws SQLException {
		randomDataBatchInsertGenerator.generateTpNotifications();
	}


	public static void main(String[] args) {

		SpringApplication.run(RandomDataBatchInsertApplication.class, args);
	}

/*  @PostConstruct
  public void setRandomDataBatchInsertGenerator() throws SQLException {
    randomDataBatchInsertGenerator.generateTpNotifications();
  }*/
}
