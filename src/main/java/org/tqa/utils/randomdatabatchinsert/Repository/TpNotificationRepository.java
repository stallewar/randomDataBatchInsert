package org.tqa.utils.randomdatabatchinsert.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tqa.utils.randomdatabatchinsert.POJO.TpNotificationsEntity;

@Repository
public interface TpNotificationRepository extends CrudRepository<TpNotificationsEntity, Long> {


}
