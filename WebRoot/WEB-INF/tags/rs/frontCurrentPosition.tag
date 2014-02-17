<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/rs/front/include/taglib.jsp"%>
<%@ attribute name="industryType" type="com.thinkgem.jeesite.modules.rs.entity.IndustryType" required="true" description="行业对象"%>
<li><strong>当前位置：</strong><a href="${rtx}">首页</a></li><c:forEach items="${fnc:getCategoryListByIds(category.parentIds)}" var="tpl">
	<!--<c:if test="${tpl.id ne 1}"><li><span class="divider">/</span> <a href="${ctx}/list-${tpl.id}${urlSuffix}">${tpl.name}</a></li></c:if>-->
</c:forEach><li><span class="divider">/</span> <a href="${ctx}/list-${category.id}${urlSuffix}">${category.name}</a></li>
<!-- 未完成待修改 -->