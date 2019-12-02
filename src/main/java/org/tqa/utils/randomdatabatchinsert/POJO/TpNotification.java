package org.tqa.utils.randomdatabatchinsert.POJO;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "TP_NOTIFICATIONS", schema = "CAMPAIGNS")
public class TpNotification implements Serializable {
	@Id
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "retailerRaw_seq")
	@SequenceGenerator(name = "retailerRaw_seq", sequenceName = "TP_NOTIFICATIONS_SEQ")
	private Long id;

	@Column(name = "ACTION")
	private String action;

	@Column(name = "LEAD_ID")
	private String leadId;

	@Column(name = "DATE_TIME")
	private Date dateTime;

	@Column(name = "SERVICE_NAME")
	private String serviceName;

	@Column(name = "SERVICE_CODE")
	private String serviceCode;

	@Column(name = "ORDERING_CHANNEL")
	private String orderingChannel;

	@Column(name = "PROMO_CHANNEL")
	private String promoChannel;

	@Column(name = "RESULT_CODE")
	private String resultCode;

	@Column(name = "CHARGE_LEVEL")
	private String chargeLevel;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "LAST_SENT_DATE")
	private Date lastSentDate;

	@Column(name = "RETRY_COUNT")
	private String retryCount;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CREATED")
	private Date created;

	@Column(name = "HTTP_CODE")
	private String httpCode;

	@Column(name = "ERROR_TEXT")
	private String errorText;

	@Column(name = "X_STATUS_CODE")
	private String xStatusCode;

	@Column(name = "X_STATUS_TEXT")
	private String xStatusText;

	@Column(name = "REQUEST_URL")
	private String requestUrl;

	@Column(name = "REQUEST_BODY")
	private String requestBody;

	@Column(name = "DEPENDS_ON_ID")
	private String dependsOnId;

	@Column(name = "TP_FRESH_NOTIFICATION_ID")
	private String tpFreshNotificationId;

	@Column(name = "MARK_FAILED_DATE")
	private Date markFailedDate;

	public TpNotification(
			Long id,
			String action,
			String leadId,
			Date dateTime,
			String serviceName,
			String orderingChannel,
			String promoChannel,
			String resultCode,
			String chargeLevel,
			String status,
			Date lastSentDate,
			String retryCount,
			String requestId,
			Date created,
			String httpCode,
			String errorText,
			String xStatusCode,
			String xStatusText,
			String requestUrl,
			String requestBody,
			String dependsOnId,
			String tpFreshNotificationId,
			Date markFailedDate,
			String serviceCode) {
		this.id = id;
		this.action = action;
		this.leadId = leadId;
		this.dateTime = dateTime;
		this.serviceName = serviceName;
		this.serviceCode = serviceCode;
		this.orderingChannel = orderingChannel;
		this.promoChannel = promoChannel;
		this.resultCode = resultCode;
		this.chargeLevel = chargeLevel;
		this.status = status;
		this.lastSentDate = lastSentDate;
		this.retryCount = retryCount;
		this.requestId = requestId;
		this.created = created;
		this.httpCode = httpCode;
		this.errorText = errorText;
		this.xStatusCode = xStatusCode;
		this.xStatusText = xStatusText;
		this.requestUrl = requestUrl;
		this.requestBody = requestBody;
		this.dependsOnId = dependsOnId;
		this.tpFreshNotificationId = tpFreshNotificationId;
		this.markFailedDate = markFailedDate;
	}

	public TpNotification(
			String action,
			String leadId,
			Date dateTime,
			String serviceName,
			String orderingChannel,
			String promoChannel,
			String resultCode,
			String chargeLevel,
			String status,
			Date lastSentDate,
			String retryCount,
			String requestId,
			Date created,
			String dependsOnId,
			String tpFreshNotificationId,
			String serviceCode) {
		this.action = action;
		this.leadId = leadId;
		this.dateTime = dateTime;
		this.serviceName = serviceName;
		this.orderingChannel = orderingChannel;
		this.promoChannel = promoChannel;
		this.resultCode = resultCode;
		this.chargeLevel = chargeLevel;
		this.status = status;
		this.lastSentDate = lastSentDate;
		this.retryCount = retryCount;
		this.requestId = requestId;
		this.created = created;
		this.dependsOnId = dependsOnId;
		this.tpFreshNotificationId = tpFreshNotificationId;
		this.serviceCode = serviceCode;
	}

	public TpNotification() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getOrderingChannel() {
		return orderingChannel;
	}

	public void setOrderingChannel(String orderingChannel) {
		this.orderingChannel = orderingChannel;
	}

	public String getPromoChannel() {
		return promoChannel;
	}

	public void setPromoChannel(String promoChannel) {
		this.promoChannel = promoChannel;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(String chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastSentDate() {
		return lastSentDate;
	}

	public void setLastSentDate(Date lastSentDate) {
		this.lastSentDate = lastSentDate;
	}

	public String getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(String retryCount) {
		this.retryCount = retryCount;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getXStatusCode() {
		return xStatusCode;
	}

	public void setXStatusCode(String xStatusCode) {
		this.xStatusCode = xStatusCode;
	}

	public String getXStatusText() {
		return xStatusText;
	}

	public void setXStatusText(String xStatusText) {
		this.xStatusText = xStatusText;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getDependsOnId() {
		return dependsOnId;
	}

	public void setDependsOnId(String dependsOnId) {
		this.dependsOnId = dependsOnId;
	}

	public String getTpFreshNotificationId() {
		return tpFreshNotificationId;
	}

	public void setTpFreshNotificationId(String tpFreshNotificationId) {
		this.tpFreshNotificationId = tpFreshNotificationId;
	}

	public Date getMarkFailedDate() {
		return markFailedDate;
	}

	public void setMarkFailedDate(Date markFailedDate) {
		this.markFailedDate = markFailedDate;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	@Override
	public String toString() {
		return "TpNotification{"
				+ "id='"
				+ id
				+ '\''
				+ ", action='"
				+ action
				+ '\''
				+ ", leadId='"
				+ leadId
				+ '\''
				+ ", dateTime="
				+ dateTime
				+ ", serviceName='"
				+ serviceName
				+ '\''
				+ ", orderingChannel='"
				+ orderingChannel
				+ '\''
				+ ", promoChannel='"
				+ promoChannel
				+ '\''
				+ ", resultCode='"
				+ resultCode
				+ '\''
				+ ", chargeLevel='"
				+ chargeLevel
				+ '\''
				+ ", status='"
				+ status
				+ '\''
				+ ", lastSentDate="
				+ lastSentDate
				+ ", retryCount='"
				+ retryCount
				+ '\''
				+ ", requestId='"
				+ requestId
				+ '\''
				+ ", created="
				+ created
				+ ", httpCode='"
				+ httpCode
				+ '\''
				+ ", errorText='"
				+ errorText
				+ '\''
				+ ", xStatusCode='"
				+ xStatusCode
				+ '\''
				+ ", xStatusText='"
				+ xStatusText
				+ '\''
				+ ", requestUrl='"
				+ requestUrl
				+ '\''
				+ ", requestBody='"
				+ requestBody
				+ '\''
				+ ", dependsOnId='"
				+ dependsOnId
				+ '\''
				+ '}';
	}
}
