<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.dgs.infra.misc.wrapper.ResponseMessageWrapper"%>
<%@page import="com.dgs.infra.constants.DGSCommonConstants"%>
<%@page import="com.dgs.web.constants.DGSWebConstants"%>
<%@page import="com.dgs.data.domain.MmePlaylist"%>
<%@page import="com.dgs.data.domain.DGSList"%>
<%@page import="com.dgs.infra.dto.login.UserDTO"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	UserDTO userDTO = (UserDTO) session.getAttribute("user");
	ApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
	RESTUtil restUtil = (RESTUtil) context.getBean("restUtil");
	String userId = userDTO.getUserName();
	long id = userDTO.getId();
	List<MmePlaylist> myPlaylists = (List<MmePlaylist>) restUtil
			.getData(DGSWebConstants.DGS.GET_MY_PLAYLISTS_DETAILS + "?id=" + id, DGSList.class);
	pageContext.setAttribute("myPlaylists", myPlaylists);
	pageContext.setAttribute("user", session.getAttribute("userDTO"));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>MME</title>
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/favicon.ico" />
<link href="<c:url value="/resources/styles/tamg_style.css"/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/styles/table.css"/>"
	rel="stylesheet" type="text/css" />
<link type="text/css"
	href="<c:url value="/resources/styles/jquery-ui-1.8.7.custom.css"/> "
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/styles/jsDatePick_ltr.min.css"/>" />
<link type="text/css"
	href="<c:url value="/resources/styles/jquery-ui-timepicker.css"/> "
	rel="stylesheet" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-1.6.2.min.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.validate.min.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-ui.1.8.11.min.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/tamg.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.ui.timepicker.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jsDatePick.min.1.3.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/TRF.js"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jsDatePick.jquery.min.1.3.js"/>" />
<script src="scripts/jquery.dataTables.min.js" type="text/javascript"></script>
<script type="text/javascript">
	
</script>
</head>
<body style="padding: 0px; margin: 0px" onLoad="init()">
	<div id="header">
		<%@include file="../common/header.jsp"%>
	</div>
	<table class="main_table" cellpadding="0" cellspacing="0">
		<tr>
			<td class="navi_sec">
				<div id="main_navigation">
					<ul>
						<li><a href="/dgs/drexel/userhome"> <span> Home </span>
						</a></li>
					</ul>
				</div>
			</td>
			<td class="navi_sec">
				<div id="main_navigation" style="float: right">
					<ul>
						<li><a href="/dgs/login/logout"> <span> Logout </span>
						</a></li>
					</ul>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="3"><br />
				<div class="CSSTableGenerator">
					<table align="center">
						<tr>
							<td>PlayList Name</td>
							<td>Created On</td>
							<td>Action</td>
						</tr>

						<tr>
							<c:forEach var="myPlaylists" items="${myPlaylists}">
								<tr>
									<td>${myPlaylists.playlistName}</td>
									<td>${myPlaylists.playlistCreatedDate}</td>
									<td><a
										href="/dgs/drexel/deletemyplaylist?id=<c:out value="${myPlaylists.playlistId}"/>"><h3>Delete
											Playlist</a>  <strong>||</strong>  <a href="/dgs/drexel/development">Edit/Add Songs</h3></a></td>
								</tr>
							</c:forEach>
						</tr>
						<tr>
						<td colspan="3">&nbsp;</td>
						</tr>
						<tr>
						<td colspan="3">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="3">
								<div class="form_content">
									<form:form action="/dgs/drexel/createPlaylist"
										modelAttribute="mmePlaylist" commandName="mmePlaylist"
										name="submitForm" id="submitForm">
										<table class="table-border" width="100%">
											<tr>
												<td class="table-header">Create New
													Playlist</td>
											</tr>
											<tr id="sec_address">
												<td>
													<table width="100%" border="0" align="center"
														cellpadding="0" cellspacing="0">
														<tr>

															<td class="content-cell">Playlist Name<span
																class="mandatory">*</span></td>

															<td colspan="2" class="content-cell2"><input type="text"
																name="playlistName" id="playlistName" class="txtbox"/></td>
																
														</tr>
														<tr>
														<td colspan="3" class="content-cell2"><input value="${fn:escapeXml(user.id)}" type="hidden"
																name="playlistUserId" id="playlistUserId"/></td>
														
														</tr>
													</table>
												</td>
											</tr>
										</table>
									</form:form>
								</div>
								<div id="main_navigation" class="button_style">
									<ul>
										<li><a href="/dgs/drexel/userhome"><span>Cancel</span></a></li>
										<li><a href="#"
											onclick="document.getElementById('submitForm').submit();"><span>Submit</span></a></li>

									</ul>
								</div>
								</div>
							</td>
						</tr>
					</table>
				</div></td>
		</tr>
	</table>

</body>
</html>