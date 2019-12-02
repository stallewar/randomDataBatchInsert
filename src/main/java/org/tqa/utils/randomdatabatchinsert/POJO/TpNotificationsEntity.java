package org.tqa.utils.randomdatabatchinsert.POJO;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TP_NOTIFICATIONS", schema = "CAMPAIGNS")
public class TpNotificationsEntity {
	private long id;
	private String action;
	private String leadId;
	private Date dateTime;
	private String serviceName;
	private String orderingChannel;
	private String promoChannel;
	private Long resultCode;
	private Long chargeLevel;
	private String status;
	private Time lastSentDate;
	private Long retryCount;
	private String requestId;
	private Date created;
	private Long httpCode;
	private String errorText;
	private String xStatusCode;
	private String xStatusText;
	private String requestUrl;
	private String requestBody;
	private Long dependsOnId;
	private long tpFreshNotificationId;
	private Date markFailedDate;
	private String serviceCode;

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "TP_NOTIFICATIONS_SEQ")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;

	}

	@Basic
	@Column(name = "ACTION", nullable = false, length = 50)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;

	}

	@Basic
	@Column(name = "LEAD_ID", nullable = false, length = 350)
	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;

	}

	@Basic
	@Column(name = "DATE_TIME", nullable = false)
	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;

	}

	@Basic
	@Column(name = "SERVICE_NAME", length = 50)
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;

	}

	@Basic
	@Column(name = "ORDERING_CHANNEL", length = 50)
	public String getOrderingChannel() {
		return orderingChannel;
	}

	public void setOrderingChannel(String orderingChannel) {
		this.orderingChannel = orderingChannel;

	}

	@Basic
	@Column(name = "PROMO_CHANNEL", length = 50)
	public String getPromoChannel() {
		return promoChannel;
	}

	public void setPromoChannel(String promoChannel) {
		this.promoChannel = promoChannel;

	}

	@Basic
	@Column(name = "RESULT_CODE")
	public Long getResultCode() {
		return resultCode;
	}

	public void setResultCode(Long resultCode) {
		this.resultCode = resultCode;

	}

	@Basic
	@Column(name = "CHARGE_LEVEL")
	public Long getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(Long chargeLevel) {
		this.chargeLevel = chargeLevel;

	}

	@Basic
	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;

	}

	@Basic
	@Column(name = "LAST_SENT_DATE")
	public Time getLastSentDate() {
		return lastSentDate;
	}

	public void setLastSentDate(Time lastSentDate) {
		this.lastSentDate = lastSentDate;

	}

	@Basic
	@Column(name = "RETRY_COUNT")
	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;

	}

	@Basic
	@Column(name = "REQUEST_ID", nullable = false, length = 50)
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;

	}

	@Basic
	@Column(name = "CREATED", nullable = false)
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;

	}

	@Basic
	@Column(name = "HTTP_CODE")
	public Long getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(Long httpCode) {
		this.httpCode = httpCode;

	}

	@Basic
	@Column(name = "ERROR_TEXT", length = 500)
	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;

	}

	@Basic
	@Column(name = "X_STATUS_CODE", length = 10)
	public String getxStatusCode() {
		return xStatusCode;
	}

	public void setxStatusCode(String xStatusCode) {
		this.xStatusCode = xStatusCode;

	}

	@Basic
	@Column(name = "X_STATUS_TEXT", length = 500)
	public String getxStatusText() {
		return xStatusText;
	}

	public void setxStatusText(String xStatusText) {
		this.xStatusText = xStatusText;

	}

	@Basic
	@Column(name = "REQUEST_URL", length = 200)
	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;

	}

	@Basic
	@Column(name = "REQUEST_BODY")
	public String getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;

	}

	@Basic
	@Column(name = "DEPENDS_ON_ID")
	public Long getDependsOnId() {
		return dependsOnId;
	}

	public void setDependsOnId(Long dependsOnId) {
		this.dependsOnId = dependsOnId;

	}

	@Basic
	@Column(name = "TP_FRESH_NOTIFICATION_ID", nullable = false)
	public long getTpFreshNotificationId() {
		return tpFreshNotificationId;
	}

	public void setTpFreshNotificationId(long tpFreshNotificationId) {
		this.tpFreshNotificationId = tpFreshNotificationId;

	}

	@Basic
	@Column(name = "MARK_FAILED_DATE")
	public Date getMarkFailedDate() {
		return markFailedDate;
	}

	public void setMarkFailedDate(Date markFailedDate) {
		this.markFailedDate = markFailedDate;

	}

	@Basic
	@Column(name = "SERVICE_CODE", length = 50)
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TpNotificationsEntity that = (TpNotificationsEntity) o;
		return id == that.id &&
				tpFreshNotificationId == that.tpFreshNotificationId &&
				Objects.equals(action, that.action) &&
				Objects.equals(leadId, that.leadId) &&
				Objects.equals(dateTime, that.dateTime) &&
				Objects.equals(serviceName, that.serviceName) &&
				Objects.equals(orderingChannel, that.orderingChannel) &&
				Objects.equals(promoChannel, that.promoChannel) &&
				Objects.equals(resultCode, that.resultCode) &&
				Objects.equals(chargeLevel, that.chargeLevel) &&
				Objects.equals(status, that.status) &&
				Objects.equals(lastSentDate, that.lastSentDate) &&
				Objects.equals(retryCount, that.retryCount) &&
				Objects.equals(requestId, that.requestId) &&
				Objects.equals(created, that.created) &&
				Objects.equals(httpCode, that.httpCode) &&
				Objects.equals(errorText, that.errorText) &&
				Objects.equals(xStatusCode, that.xStatusCode) &&
				Objects.equals(xStatusText, that.xStatusText) &&
				Objects.equals(requestUrl, that.requestUrl) &&
				Objects.equals(requestBody, that.requestBody) &&
				Objects.equals(dependsOnId, that.dependsOnId) &&
				Objects.equals(markFailedDate, that.markFailedDate) &&
				Objects.equals(serviceCode, that.serviceCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, action, leadId, dateTime, serviceName, orderingChannel, promoChannel, resultCode, chargeLevel, status, lastSentDate, retryCount, requestId, created, httpCode, errorText, xStatusCode, xStatusText, requestUrl, requestBody, dependsOnId, tpFreshNotificationId, markFailedDate, serviceCode);
	}
}
