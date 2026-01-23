CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    username TEXT NOT NULL,
    password TEXT NOT NULL,
    user_role_id INT NOT NULL,
    FOREIGN KEY(user_role_id) REFERENCES user_roles(id)
);

PRAGMA foreign_keys = ON;

-- =========================
-- UserRole
-- =========================
CREATE TABLE IF NOT EXISTS user_roles (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    name TEXT NOT NULL,
    description TEXT NOT NULL
);

-- =========================
-- User
-- =========================
CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    user_role_id INTEGER NOT NULL,
    address_location_id INTEGER NOT NULL,
    username TEXT NOT NULL,
    password TEXT NOT NULL,
    FOREIGN KEY (user_role_id) REFERENCES user_roles(id),
    FOREIGN KEY (address_location_id) REFERENCES locations(id)
    );

-- =========================
-- Location
-- =========================
CREATE TABLE IF NOT EXISTS locations (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    name TEXT NOT NULL
);

-- =========================
-- Road
-- =========================
CREATE TABLE IF NOT EXISTS roads (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    source_location_id INTEGER NOT NULL,
    target_location_id INTEGER NOT NULL,
    distance REAL NOT NULL,
    FOREIGN KEY (source_location_id) REFERENCES locations(id),
    FOREIGN KEY (target_location_id) REFERENCES locations(id)
);

-- =========================
-- OrderStatus
-- =========================
CREATE TABLE IF NOT EXISTS order_statuses (
   id INTEGER PRIMARY KEY AUTOINCREMENT,
   created_at DATETIME NOT NULL,
   name TEXT NOT NULL,
   description TEXT NOT NULL
);

-- =========================
-- Order
-- =========================
CREATE TABLE IF NOT EXISTS orders (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    client_id INTEGER NOT NULL,
    courier_id INTEGER,
    order_status_id INTEGER NOT NULL,
    FOREIGN KEY (client_id) REFERENCES users(id),
    FOREIGN KEY (courier_id) REFERENCES users(id),
    FOREIGN KEY (order_status_id) REFERENCES order_statuses(id)
);

-- =========================
-- Item
-- =========================
CREATE TABLE IF NOT EXISTS items (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    name TEXT NOT NULL
);

-- =========================
-- Warehouse
-- =========================
CREATE TABLE IF NOT EXISTS warehouses (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    location_id INTEGER NOT NULL,
    FOREIGN KEY (location_id) REFERENCES locations(id)
);

-- =========================
-- Stock
-- =========================
CREATE TABLE IF NOT EXISTS stock (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    item_id INTEGER NOT NULL,
    warehouse_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    FOREIGN KEY (item_id) REFERENCES items(id),
    FOREIGN KEY (warehouse_id) REFERENCES warehouses(id),
    UNIQUE (item_id, warehouse_id)
);

-- =========================
-- OrderItem (junction table)
-- =========================
CREATE TABLE IF NOT EXISTS order_items (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    created_at DATETIME NOT NULL,
    order_id INTEGER NOT NULL,
    item_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (item_id) REFERENCES items(id),
    UNIQUE (order_id, item_id)
);
