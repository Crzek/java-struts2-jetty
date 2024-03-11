<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>
    <p>importe: ${invoiceBean.value}</p>
    <p>IVA (21%): ${invoiceBean.value * 0.21}</p>
    <p>importe + IVA: ${invoiceBean.value * 1.21 }</p>


</body>
</html>