# Escuela Colombiana de Ingenier铆a Julio Garavito - Arquitecturas de Software ARSW - Parcial Segundo Tercio
# Lina Buitrago Parcial-T2

### _Despliegue en HEROKU_ 馃摝

[![ParcialT2](https://www.herokucdn.com/deploy/button.png)](https://buitrago-arsw-t2.herokuapp.com/)

### Dise帽o
La aplicaci贸n esta dise帽ada para que por medio del buscador con solo ingresar la ciudad se obtengan todos los datos de la misma como:
* Tiempo 
* Temperatura 
* Estado del Cielo 
* Velocidad del Tiempo 

_Estructuralmente_

La aplicaci贸n empieza en index.html que se conecta con el back por medio de un appiClient , dicho api client no solo conecta sino que tambien trae todos los datos necesarios para hacer la consulta y mostrarla en pantalls



### Ejecuci贸n
Se hace por medio del comando 
_mvn spring-boot:run_

### Extensi贸n 

Para extender el proyecto y asignarle nuevas funcionalidades basta con agregar los metodos a los servicios del backend y las funciones necesarias al appiClient


## Preparaci贸n para el Parcial

Con el objetivo de preparar el examen final del segundo tercio, por favor siga las siguientes instrucciones.

1. Explore el API de OpenWeather en el siguiente [enlace](https://openweathermap.org/ ).
2. Use la colecci贸n de Postman adjunta para validar el funcionamiento del endpoint por fuera de la p谩gina de OpenWeather.
3. Si no ha terminado por completo el 煤ltimo laboratorio, hagalo, si es necesario desde el inicio y completo. En ese laboratorio esta basado el parcial.
4. Revise la documentaci贸n de Google Maps para agregar marcadores a un mapa o revise este [Codepen](https://codepen.io/SitePoint/pen/YWKLzv?editors=0110)

## Descripci贸n del Problema a Solucionar

Parcial del segundo tercio

Su compa帽铆a lo ha seleccionado para construir una aplicaci贸n para consultar el estado del clima en lugares espec铆ficos de la tierra.  

La aplicaci贸n recibir谩 en un campo el nombre de una ciudad, por ejemplo `London` para Londres y deber谩 mostrar la informaci贸n del clima para esa ciudad. Para esto utilice el API gratuito de [openweathermap](https://openweathermap.org/ ) (Puede crear una cuenta para obtener la llave para realizar consultas). Se le pide que su implementaci贸n sea eficiente en cuanto a recursos as铆 que debe implementar un cach茅 que permita evitar hacer consultas repetidas al API externo. Una vez tenga la funcionalidad b谩sica, extienda su implementaci贸n para incluir una funcionalidad para mostrar mapas de la ciudad con diferentes capas del clima (revise la funcionalidad del API de mapas de clima y el ejemplo anexo.). La implementaci贸n del mapa puede ir directamente a los servicios externos sin pasar por el servidor intermediario.
Sugerencia realice la implementaci贸n de manera incremental. Haga commits regulares.

Ejemplo de la interfaz gr谩fica

![](images/interfaz.png)

La arquitectura debe tener las siguientes caracter铆sticas.

1. El cliente Web debe ser un cliente as铆ncrono que use servicios REST desplegados en Heroku y use Json como formato para los mensajes.
2. La aplicaci贸n debe estar desplegada en Heroku.
3. El servidor de Heroku servir谩 como un gateway para encapsular llamadas a otros servicios Web externos.
4. La aplicaci贸n debe ser multiusuario (Sin registro y sin seguridad )
5. Todos los protocolos de comunicaci贸n ser谩n sobre HTTP.
6. Los formatos de los mensajes de intercambio ser谩n siempre JSON.
7. La interfaz gr谩fica del cliente debe ser los m谩s limpia y agradable posible y debe utilizar Bootstrap. Para invocar m茅todos REST desde el cliente usted puede utilizar la tecnolog铆a que desee.
8. Debe construir un cliente Java que permita probar las funciones tanto del servidor fachada como del cliente externo. El cliente utiliza simples conexiones http para conectarse a los servicios. Este cliente debe hacer pruebas de concurrencia a sus servidor Spring.
9 .La fachada de servicios tendr谩 un cach茅 que permitir谩 que llamados que ya se han realizado a las implementaciones concretas con par谩metros espec铆ficos no se realicen nuevamente. Puede almacenar el llamado como un String con su respectiva respuesta, y comparar el string respectivo. Recuerde que el cach茅 es una simple estructura de datos.
10. Si el dato del cache tiene m谩s de 5 min se debe solicitar nuevamente al servidor externo.
11. Se debe poder extender f谩cilmente, por ejemplo, es f谩cil agregar nuevas funcionalidades, o es f谩cil cambiar el proveedor de una funcionalidad.
12. Debe utilizar maven para gestionar el ciclo de vida, git y github para almacenar al c贸digo fuente y heroku como plataforma de producci贸n.

AJUSTE LOS DIAGRAMAS DE ARQUITECTURA QUE SEAN NECESARIOS PARA REFLEJAR LAS DESICIONES DE ARQUITECTURA QUE TOMO SOBRE EL DESARROLLO DEL PARCIAL.

![](images/WeatherDiagrams.svg)

## Entrega

1. La aplicaci贸n funcionando en Heroku con el nombre (APELLIDO-ARSW-T2) y el c贸digo fuente almacenado en un proyecto GitHub con el nombre (APELLIDO-ARSW-T2).
2. Los fuentes deben estar documentados y bien estructurados para generar el Javadoc.
3. El Readme.md debe describir el dise帽o, la forma de ejecutar el progrema localmente, explicar c贸mo se puede extender y c贸mo podr铆a, por ejemplo, hacer que una funci贸n espec铆fica la implementara un proveedor de servicios diferente.
4. Indique la urls de Github, Heroku
5. Suba el zip del proyecto al aula con el nombre (APELLIDO-ARSW-T2).
6. Guarde una copia de su proyecto.

## Criterios de evaluaci贸n:

1. Cliente escrito en JS as铆ncrono invocando servicios REST (10%)
2. Servidor fachada exponiendo servicios REST (10%)
3. Conexi贸n a servicios externos (10%)
4. Cliente Java para Tests concurrentes  para el servicio en Heroku y para el del proveedor externo(10%)
5. Cache tolerante a la concurrencia y una sola instancia para la aplicaci贸n (10%)
6. Implementa la funcionalidad de los mapas de manera as铆ncrona (15%)
7. Dise帽o y descripci贸n del dise帽o son de alta calidad (30%)
    * Extensible
    * Usa patrones
    * Modular
    * Organizado
    * Javadoc publicado
    * Identifica la funci贸n de componentes individuales demuestra conocimiento del funcionamiento general de la arquitectura.
    
## Ayuda

* Inicie con la aplicaci贸n web basada en spring que le propone Heroku en su gu铆a inicial para java. (https://devcenter.heroku.com/articles/getting-started-with-java)
* Para invocar un servicios get desde java puede hacerlo de manera f谩cil como muestra el siguiente c贸digo, revise la [clase de pruebas adjunto al examen](openWeatherAPITest/src/test/java/openWeatherAPITest/UnirestTest.java) para m谩s informaci贸n:

```java
@Test
	public void shouldReturnAllCases() throws UnirestException {
		HttpResponse<JsonNode> response = Unirest
				.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats")
				.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
				.header("x-rapidapi-key", "34f05cff54msh30ba6f36c91c183p166499jsn555917ef62b8")
				.asJson();
		
		assertNotNull(response.getBody());
		assertEquals((int)HttpStatus.SC_OK,response.getStatus());
	}
```

*  Parseo de un JSON

```html
<!DOCTYPE html>
<html>
<body>

<h2>Create Object from JSON String</h2>

<p id="demo"></p>

<script>
var txt = '{"name":"John", "age":30, "city":"New York"}'
var obj = JSON.parse(txt);
document.getElementById("demo").innerHTML = "name: " + obj.name + ", age: " + obj.age;
</script>

</body>
</html>

```

* C贸digo de p谩gina con Mapa embebido [(Ver archivo)](index.html)
    
