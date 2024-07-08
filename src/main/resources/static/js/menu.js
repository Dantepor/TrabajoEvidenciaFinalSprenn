$(document).ready(function() {
    var page = 0; // Página inicial (0-indexada)

    // Función para cargar productos según la página
    function cargarProductos(page) {
        $.ajax({
            type: "GET",
            url: "/m/productos?page=" + page, // Endpoint de tu API para obtener productos paginados
            success: function(response) {
                $("#productosContainer .release-item").remove(); // Eliminar productos actuales
                response.forEach(function(producto) {
                    var html = `
                        <div class="release-item">
                            <a href="/producto/${producto.id}">
                                <img src="/img/${producto.imagen}" alt="${producto.nombreproducto}">
                            </a>
                            <h3 class="release-title">${producto.nombreproducto}</h3>
                            <p class="release-date">${producto.fecha}</p>
                            <div class="offer-ends2">
                                <p>${producto.estado}</p>
                            </div>
                            <div class="offer-price">
                                <p>
                                    S/ ${producto.precio.toFixed(2)} 
                                    <span class="original-price">S/ ${producto.antprecio.toFixed(2)}</span>
                                    <span class="discount">-${producto.descuento}%</span>
                                </p>
                            </div>
                            <div class="platform-icons">
                                <img src="/img/PS5.png" alt="PS5" class="platform-icon">
                                <img src="/img/Xbox.png" alt="Xbox" class="platform-icon1">
                                <img src="/img/PC.png" alt="PC" class="platform-icon2">
                            </div>
                            <span class="heart-icon">&#10084;</span>
                        </div>
                    `;
                    $(".release-grid").append(html); // Agregar producto al contenedor
                });
            },
            error: function(error) {
                console.error("Error cargando productos:", error);
            }
        });
    }

    // Cargar primeros productos al cargar la página
    cargarProductos(page);

    // Manejar clic en "Siguiente"
    $("#pageNext").on("click", function(e) {
        e.preventDefault();
        page++; // Incrementar página
        cargarProductos(page); // Cargar productos de la siguiente página
    });

    // Manejar clic en "Anterior"
    $("#pagePrevious").on("click", function(e) {
        e.preventDefault();
        if (page > 0) {
            page--; // Decrementar página si no es la primera página
            cargarProductos(page); // Cargar productos de la página anterior
        }
    });
});