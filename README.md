# Proyecto de Integración de Datos de Marvel

## Descripción
Este proyecto tiene como objetivo integrar datos de personajes de Marvel desde la API pública de Marvel hacia una base de datos local. Los datos de la API se obtienen a través de solicitudes HTTP, se transforman y luego se almacenan en una base de datos local.

## Componentes Principales

### Controladores (Controllers)
- **MarvelApiController**: Este controlador expone una serie de endpoints para interactuar con los datos de personajes de Marvel. Permite obtener todos los personajes, buscar por ID, crear nuevos personajes, actualizar y eliminar personajes.

### Servicios (Services)
- **MarvelApiService**: Este servicio se encarga de realizar solicitudes HTTP a la API pública de Marvel para obtener datos de personajes.
- **MarvelCharacterService**: Este servicio maneja la lógica de negocio relacionada con los personajes de Marvel, incluyendo la transformación de datos y la interacción con el repositorio.

### Modelos (Models)
- **MarvelApiResponse**: Modelo que representa la respuesta de la API pública de Marvel.
- **MarvelCharacter**: Modelo que representa un personaje de Marvel y su relación con otros objetos como URLs, descripciones, etc.
- **CharacterUrl**, **CharacterThumbnail**, **CharacterCollection**: Modelos relacionados con las propiedades de un personaje de Marvel.

### Repositorios (Repositories)
- **CharacterRepository**: Interfaz que define métodos para interactuar con la base de datos H2 y gestionar los personajes de Marvel.

## Configuración

### Llave de API de Marvel
Asegúrate de configurar tu llave de API de Marvel en el archivo `application.properties` o `application.yml` para que el proyecto pueda realizar solicitudes a la API pública de Marvel.

### properties
marvel.api.publicKey=your_public_key
marvel.api.privateKey=your_private_key 

## Uso

Una vez que el proyecto esté configurado y en funcionamiento, puedes usar las siguientes rutas para interactuar con los datos de personajes de Marvel:

- Obtener todos los personajes: `GET /api/marvel/characters`
- Obtener un personaje por ID: `GET /api/marvel/characters/{id}`
- Crear un nuevo personaje: `POST /api/marvel/characters`
- Actualizar un personaje existente por ID: `PUT /api/marvel/characters/{id}`
- Eliminar un personaje por ID: `DELETE /api/marvel/characters/{id}`

Además, puedes usar los siguientes endpoints proporcionados por el controlador `MarvelController`:

- Obtener datos de personajes de Marvel desde la API pública: `GET /marvel/fetchCharacters`
- Obtener y guardar datos de personajes de Marvel desde la API pública: `POST /marvel/fetchAndSaveCharacters`

Asegúrate de que el controlador `MarvelController` esté correctamente configurado en tu proyecto para utilizar estos endpoints adicionales.

Para obtener más detalles sobre cómo funcionan estos endpoints, consulta el código fuente en el controlador `MarvelController` en el proyecto.

---

Desarrollado por Andrés Peña Ortega.
