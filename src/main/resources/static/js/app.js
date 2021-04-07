var cliente = apiClient;
var app = (function () {

    var latitud=0;
    var long=0;
    function initMap() {
        // The location of Uluru

        const uluru = { lat: latitud, lng: long };

        // The map, centered at Uluru
        const map = new google.maps.Map(document.getElementById("map"), {
            zoom: 10,
            center: uluru,
        });
        // The marker, positioned at Uluru
        const marker = new google.maps.Marker({
            position: uluru,
            map: map,
        });
    }

    function llenarDatos(informacion) {
        var datos = JSON.parse(informacion);
        if (datos == null){
            return new Error("No se encontro informacion de la ciudad");
        }

        document.getElementById("tiempo").innerHTML = "Tiempo: "+datos.weather[0].main;
        document.getElementById("maxima").innerHTML = "Temperatura maxima: "+datos.main.temp_max + " °K";
        document.getElementById("minima").innerHTML = "Temperatua minima: "+datos.main.temp_min +" °K";
        document.getElementById("cielo").innerHTML = "Nubosidad: "+datos.clouds.all +"%";
        document.getElementById("velViento").innerHTML = "Velocidad del viento: "+datos.wind.speed +" Km/H";
        latitud = datos.coord.lat;
        long = datos.coord.lon;
        initMap();
    }

    return {
        getDatos: function (ciudad) {
            apiClient.getDatos(ciudad,llenarDatos);
            initMap();
        },
        iniciar:function (){
            initMap();
        }



    };

})();