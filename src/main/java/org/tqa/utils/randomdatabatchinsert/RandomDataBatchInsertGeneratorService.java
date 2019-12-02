package org.tqa.utils.randomdatabatchinsert;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;
import org.tqa.utils.randomdatabatchinsert.POJO.TpNotificationsEntity;
import org.tqa.utils.randomdatabatchinsert.Repository.TpNotificationRepository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.*;

@Service
public class RandomDataBatchInsertGeneratorService {
	@Autowired
	DataSource oracleDataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	//@Autowired
	//TpNotificationRepository tpNotificationRepository;
	@Resource
	TpNotificationRepository tpNotificationRepository;
	@Value("${outRows}")
	int outRows;
	private Faker faker = new Faker(new Locale("ru"));
	private long time = System.currentTimeMillis();
	private Logger log = LoggerFactory.getLogger(this.getClass());


	@Transactional
	public void generateTpNotifications() {
		List<TpNotificationsEntity> tpNotifications = new ArrayList<>();

		for (int i = 0; i <= outRows; i++) {
			TpNotificationsEntity tpNotificationsEntity = new TpNotificationsEntity();
			tpNotificationsEntity.setAction(faker.options().option("SUBSCRIBE", "UNSUBSCRIBE", "TARIFFICATION"));
			tpNotificationsEntity.setLeadId("11A479456A092703E0531A25A8C073D3_" + faker.numerify("#########"));
			tpNotificationsEntity.setDateTime(new java.sql.Date(time));
			tpNotificationsEntity.setServiceName("TQA-568");
			tpNotificationsEntity.setServiceCode(faker.options().option("88888881", "88888063", "88888064", "88888065"));
			tpNotificationsEntity.setOrderingChannel("TMPRTSGWAY-926");
			tpNotificationsEntity.setPromoChannel("developers");
			tpNotificationsEntity.setResultCode(null);
			tpNotificationsEntity.setChargeLevel(10L);
			tpNotificationsEntity.setStatus("INIT");
			tpNotificationsEntity.setLastSentDate(null);
			tpNotificationsEntity.setRetryCount(0L);
			tpNotificationsEntity.setRequestId(String.valueOf(UUID.randomUUID()));
			tpNotificationsEntity.setDependsOnId(null);
			tpNotificationsEntity.setTpFreshNotificationId(Long.parseLong(faker.numerify("##########")));
			tpNotificationsEntity.setCreated(new java.sql.Date(time));
			System.out.println("TpNotification = " + tpNotificationsEntity);
			tpNotifications.add(tpNotificationsEntity);

		}
		//tpNotificationRepository.deleteAll();
		tpNotificationRepository.saveAll(tpNotifications);


		System.out.println("XXX = " + tpNotifications.size());
		System.out.println(
				"YYY = " + Arrays.toString(tpNotifications.toArray(tpNotifications.toArray())

				));


		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
	}
}





/*

      Statement statement = connection.createStatement();

      String truncate = "TRUNCATE TABLE TP_NOTIFICATIONS";
      statement.executeUpdate(truncate);
*/




 /*     String insert =
              "INSERT INTO TP_NOTIFICATIONS (action, lead_id, date_time, service_name, service_code, ordering_channel, promo_channel ,result_code ,charge_level, status, last_sent_date, retry_count, request_id, depends_on_id, tp_fresh_notification_id, created )VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

*/

    /*    try {

          jdbcTemplate.batchUpdate(
                  insert,
                  new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement preparedStatement, int i)
                            throws SQLException {
                      System.out.println("YYY = " + preparedStatement.toString());
                      preparedStatement.setString(
                              1,
                              faker.options().option("SUBSCRIBE", "UNSUBSCRIBE", "TARIFFICATION")); // action
                      preparedStatement.setString(
                              2,
                              "11A479456A092703E0531A25A8C073D3_" + faker.numerify("#########")); // lead_id
                      preparedStatement.setDate(3, new java.sql.Date(time)); // date_time
                      preparedStatement.setString(4, "TQA-568"); // service_name
                      preparedStatement.setString(5, "8888881"); // service_code
                      preparedStatement.setString(6, "TMPRTSGWAY-926"); // ordering_channel
                      preparedStatement.setString(7, "developers"); // promo_channel
                      preparedStatement.setString(8, ""); // result_code
                      preparedStatement.setString(9, ""); // charge_level
                      preparedStatement.setString(10, "INIT"); // status
                      preparedStatement.setDate(11, null); // last_send_date
                      preparedStatement.setString(12, ""); // retry_count
                      preparedStatement.setString(14, String.valueOf(UUID.randomUUID())); // request_id
                      preparedStatement.setString(13, ""); // depends_on_id
                      preparedStatement.setString(15, (faker.numerify("##########"))); // tp_notification_fresh_id
                      preparedStatement.setDate(16, new java.sql.Date(time)); // created
                      System.out.println("XXX = " + insert);
                    }

                    @Override
                    public int getBatchSize() {
                      log.info("Insert Size = " + outRows);
                      return outRows;
                    }
                  });
        } catch (Exception re) {
          re.printStackTrace();
        }
      }
      stopWatch.stop();
      log.info("DONE in " + stopWatch.getTotalTimeSeconds() + " seconds");
    }*/