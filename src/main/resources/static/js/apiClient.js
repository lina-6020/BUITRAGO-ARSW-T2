//const apiUrl = "http://localhost:8080/Ciudades/"
apiClient = (function () {

    return {
        getCityByName : function(ciudad ,callback){
            var promise = $.ajax({
                url: "/Ciudades/"+ciudad,
                type: 'GET',
                contentType: "application/json"
            });
            promise.then(
                function (data) {
                    console.info("OK");
                    callback(data);
                },
                function () {
                    console.info("ERROR");
            });
        }
        
    }

})();