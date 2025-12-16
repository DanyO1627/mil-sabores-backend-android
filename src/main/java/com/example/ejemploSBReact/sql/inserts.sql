-- INSERTS usuarios
INSERT INTO `usuarios` (`id`, `clave`, `comuna`, `email`, `nombre`, `region`) VALUES (1, 'empleado123', 'Santiago', 'admin@milsabores.cl', 'Admin', 'Región Metropolitana'), (2, 'maria2024', 'Providencia', 'maria.gonzalez@gmail.com', 'María González', 'Región Metropolitana'), (3, 'carlos456', 'Viña del Mar', 'carlos.rojas@hotmail.com', 'Carlos Rojas', 'Región de Valparaíso'), (4, 'ana789', 'Concepción', 'ana.martinez@outlook.com', 'Ana Martínez', 'Región del Biobío'), (5, 'pedro321', 'La Serena', 'pedro.lopez@gmail.com', 'Pedro López', 'Región de Coquimbo'), (6, 'sofia2025', 'Maipú', 'sofia.fernandez@yahoo.com', 'Sofía Fernández', 'Región Metropolitana'), (7, 'diego555', 'Temuco', 'diego.silva@gmail.com', 'Diego Silva', 'Región de La Araucanía'), (8, 'lucia888', 'Antofagasta', 'lucia.morales@hotmail.com', 'Lucía Morales', 'Región de Antofagasta'), (9, 'javier999', 'Valdivia', 'javier.nunez@outlook.com', 'Javier Núñez', 'Región de Los Ríos'), (10, 'camila2024', 'Ñuñoa', 'camila.castro@gmail.com', 'Camila Castro', 'Región Metropolitana');

INSERT INTO `categorias` (id_categoria, nombre_categoria, descripcion_categoria, imagen_url, activo) VALUES
(1, 'Tortas & Pasteles', 'Deliciosas tortas y pasteles para toda ocasión', '/img/productos/tarta-selva-negra.jpg', 1),
(2, 'Tartas & Pies', 'Exquisitas tartas y pies artesanales', '/img/productos/cheesecakeImg.webp', 1),
(3, 'Individuales & Repostería Fina', 'Pequeñas delicias para disfrutar en cualquier momento', '/img/productos/macarons2.webp', 1),
(4, 'Especialidades & Gourmet', 'Productos premium y especiales', '/img/productos/Tiramisu2.webp', 1);


INSERT INTO `productos` (`id_producto`, `nombre_producto`, `precio`, `imagen_url`, `descripcion_producto`, `descripcion_larga`, `activo`, `stock`, `id_categoria`) VALUES

(1, 'Torta de Treintaicinco Leches', 60000, 'https://cdn0.recetasgratis.net/es/posts/0/1/9/torta_tres_leches_8910_orig.jpg', 'Torta tres leches húmeda, con textura suave y sabor casero.', 'Torta tres leches húmeda, con textura suave y sabor casero.', 1, 1, 1),

(2, 'Tarta de Manzana', 8500, 'https://imag.bonviveur.com/tarta-de-manzana.jpg', 'Tarta con manzanas caramelizadas y toque de canela.', 'Disfruta de nuestra Tarta de Manzana con masa crujiente y manzanas caramelizadas al horno.', 1, 13, 2),

(3, 'Cheesecake Frutos Rojos', 10000, 'https://www.paulinacocina.net/wp-content/uploads/2025/01/receta-de-cheesecake-1742898428.jpg', 'Cheesecake con base de galleta y cobertura de frutos rojos.', 'El Cheesecake de Frutos Rojos es una delicia cremosa con base crocante y un topping fresco de frutos rojos.', 1, 2, 2),

(4, 'Brownie XL', 7990, 'https://images.aws.nestle.recipes/resized/2024_10_23T08_38_28_badun_images.badun.es_ac5fa47c04dd_brownie_de_chocolate_negro_1290_742.jpg', 'Brownie de chocolate intenso con textura fudgy.', 'Nuestro Brownie XL es la máxima expresión del chocolate: húmedo, denso y perfecto para acompañar con helado.', 1, 3, 3),

(5, 'Pie de Limón', 8500, 'https://www.recetasnestle.cl/sites/default/files/srh_recipes/49d627e69672b6915c22f2eb2dfd1b93.jpg', 'Pie con base crocante y crema de limón.', 'El clásico y vibrante Pie de Limón: base crujiente, crema cítrica y un suave merengue flameado.', 1, 11, 2),

(6, 'Torta Selva Negra', 13500, 'https://sarasellos.com/wp-content/uploads/2024/06/tarta-selva-negra2-819x1024.jpg', 'Bizcocho de chocolate con crema y cerezas.', 'La auténtica Torta Selva Negra: capas de bizcocho húmedo de chocolate con crema batida y cerezas ácidas.', 1, 4, 1),

(7, 'Tarta de Frambuesa', 9600, 'https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/FE68C7EE-020B-456D-BF9D-8F10D39DA6A6/Derivates/52175A9A-FAEF-44C1-B1F7-CAAA169F5771.jpg', 'Tarta casera con frambuesas frescas.', 'Base de masa dulce y una capa generosa de frambuesas frescas sobre crema pastelera.', 1, 13, 2),

(8, 'Torta Milhojas', 14000, 'https://www.paulinacocina.net/wp-content/uploads/2021/11/torta-rogel.jpg', 'Capas de masa hojaldrada con manjar.', 'Finísimas capas de hojaldre crocante intercaladas con abundante manjar casero.', 1, 7, 1),

(9, 'Cupcakes Vainilla', 4800, 'https://gourmet.iprospect.cl/wp-content/uploads/2022/11/RECETA-cupcakes-alta-5.jpg', 'Cupcakes suaves de vainilla.', 'Pack de 6 cupcakes esponjosos, cubiertos con buttercream de vainilla.', 1, 20, 3),

(10, 'Galletas Decoradas', 5500, 'https://camillestyles.com/wp-content/uploads/2025/12/slice-and-bake-cookies-800x800.jpg', 'Galletas de mantequilla decoradas.', 'Galletas artesanales decoradas a mano con glaseado real y colores vibrantes.', 1, 15, 3),

(11, 'Torta Zanahoria', 11000, 'https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/E227AB55-C6D3-414D-9834-D55557EA49F9/Derivates/2e9af109-87ca-42f7-a2be-08afd08bc9ca.jpg', 'Bizcocho húmedo de zanahoria.', 'Bizcocho especiado con zanahoria rallada, nueces y frosting de queso crema.', 1, 8, 4),

(12, 'Tarta de Maracuyá', 9000, 'https://cdn.elpopular.mx/notas/estilo/buen-gusto/2020/06/25/elabora-pay-de-maracuya-en-casa/12bd2cc61b8d2243920fb094cdb6c902.jpg', 'Tarta refrescante de maracuyá.', 'Base crujiente y suave crema de maracuyá con un toque ácido característico.', 1, 12, 4),

(13, 'Torta de Chocolate', 12500, 'https://eatwithclarity.com/wp-content/uploads/2023/05/gluten-free-chocolate-cake-5.jpg', 'Torta de bizcocho húmedo.', 'Bizcocho húmedo y cremoso con cobertura de chocolate intenso.', 1, 11, 1),

(14, 'Red Velvet Cookies', 6500, 'https://www.janespatisserie.com/wp-content/uploads/2020/05/IMG_1062_1-300x300.jpg', 'Galletas suaves Red Velvet.', 'Galletas esponjosas con chips de chocolate blanco, suaves por dentro y crujientes por fuera.', 1, 17, 3),

(15, 'Banana Muffins', 7200, 'https://itsavegworldafterall.com/wp-content/uploads/2025/10/Pumpkin-Banana-Muffins-FI-360x480.jpg', 'Muffins esponjosos con plátano.', 'Muffins caseros con banana madura, especias y textura súper húmeda.', 1, 16, 3);

--


-- ============================================
-- 3. INSERTAR CARRITOS
-- ============================================

-- Carrito 1: Carrito activo con postres variados
INSERT INTO carritos (id_carrito, confirmado) VALUES (1, 0);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(1, 1, 'https://cdn0.recetasgratis.net/es/posts/0/1/9/torta_tres_leches_8910_orig.jpg', 'Torta de Treintaicinco Leches', 60000, 1, 1),
(2, 2, 'https://www.paulinacocina.net/wp-content/uploads/2025/01/receta-de-cheesecake-1742898428.jpg', 'Cheesecake Frutos Rojos', 10000, 3, 1),
(3, 3, 'https://gourmet.iprospect.cl/wp-content/uploads/2022/11/RECETA-cupcakes-alta-5.jpg', 'Cupcakes Vainilla', 4800, 9, 1);
-- Total: $94,400

-- Carrito 2: Carrito con tortas premium
INSERT INTO carritos (id_carrito, confirmado) VALUES (2, 0);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(4, 1, 'https://sarasellos.com/wp-content/uploads/2024/06/tarta-selva-negra2-819x1024.jpg', 'Torta Selva Negra', 13500, 6, 2),
(5, 1, 'https://www.paulinacocina.net/wp-content/uploads/2021/11/torta-rogel.jpg', 'Torta Milhojas', 14000, 8, 2);
-- Total: $27,500

-- Carrito 3: Carrito CONFIRMADO (compra finalizada)
INSERT INTO carritos (id_carrito, confirmado) VALUES (3, 1);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(6, 2, 'https://imag.bonviveur.com/tarta-de-manzana.jpg', 'Tarta de Manzana', 8500, 2, 3),
(7, 1, 'https://www.recetasnestle.cl/sites/default/files/srh_recipes/49d627e69672b6915c22f2eb2dfd1b93.jpg', 'Pie de Limón', 8500, 5, 3),
(8, 4, 'https://camillestyles.com/wp-content/uploads/2025/12/slice-and-bake-cookies-800x800.jpg', 'Galletas Decoradas', 5500, 10, 3);
-- Total: $47,500

-- Carrito 4: Carrito con productos pequeños
INSERT INTO carritos (id_carrito, confirmado) VALUES (4, 0);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(9, 5, 'https://gourmet.iprospect.cl/wp-content/uploads/2022/11/RECETA-cupcakes-alta-5.jpg', 'Cupcakes Vainilla', 4800, 9, 4),
(10, 3, 'https://www.janespatisserie.com/wp-content/uploads/2020/05/IMG_1062_1-300x300.jpg', 'Red Velvet Cookies', 6500, 14, 4),
(11, 2, 'https://itsavegworldafterall.com/wp-content/uploads/2025/10/Pumpkin-Banana-Muffins-FI-360x480.jpg', 'Banana Muffins', 7200, 15, 4);
-- Total: $57,900

-- Carrito 5: Carrito grande para fiesta 🎉
INSERT INTO carritos (id_carrito, confirmado) VALUES (5, 0);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(12, 2, 'https://cdn0.recetasgratis.net/es/posts/0/1/9/torta_tres_leches_8910_orig.jpg', 'Torta de Treintaicinco Leches', 60000, 1, 5),
(13, 3, 'https://cdn.elpopular.mx/notas/estilo/buen-gusto/2020/06/25/elabora-pay-de-maracuya-en-casa/12bd2cc61b8d2243920fb094cdb6c902.jpg', 'Torta de Chocolate', 12500, 13, 5),
(14, 10, 'https://gourmet.iprospect.cl/wp-content/uploads/2022/11/RECETA-cupcakes-alta-5.jpg', 'Cupcakes Vainilla', 4800, 9, 5),
(15, 5, 'https://camillestyles.com/wp-content/uploads/2025/12/slice-and-bake-cookies-800x800.jpg', 'Galletas Decoradas', 5500, 10, 5);
-- Total: $233,000

-- Carrito 6: Carrito con brownies y tartas
INSERT INTO carritos (id_carrito, confirmado) VALUES (6, 0);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(16, 4, 'https://images.aws.nestle.recipes/resized/2024_10_23T08_38_28_badun_images.badun.es_ac5fa47c04dd_brownie_de_chocolate_negro_1290_742.jpg', 'Brownie XL', 7990, 4, 6),
(17, 2, 'https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/FE68C7EE-020B-456D-BF9D-8F10D39DA6A6/Derivates/52175A9A-FAEF-44C1-B1F7-CAAA169F5771.jpg', 'Tarta de Frambuesa', 9600, 7, 6),
(18, 1, 'https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/E227AB55-C6D3-414D-9834-D55557EA49F9/Derivates/2e9af109-87ca-42f7-a2be-08afd08bc9ca.jpg', 'Torta Zanahoria', 11000, 11, 6);
-- Total: $62,160

-- Carrito 7: Carrito tropical
INSERT INTO carritos (id_carrito, confirmado) VALUES (7, 0);

INSERT INTO carrito_items (id_item, cantidad, imagen_url, nombre_producto, precio_unitario, producto_id, id_carrito) VALUES
(19, 2, 'https://cdn.elpopular.mx/notas/estilo/buen-gusto/2020/06/25/elabora-pay-de-maracuya-en-casa/12bd2cc61b8d2243920fb094cdb6c902.jpg', 'Tarta de Maracuyá', 9000, 12, 7),
(20, 3, 'https://itsavegworldafterall.com/wp-content/uploads/2025/10/Pumpkin-Banana-Muffins-FI-360x480.jpg', 'Banana Muffins', 7200, 15, 7);
-- Total: $39,600

