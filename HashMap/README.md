# 📘 HashMap in Java (with Looping)

## 📌 What is HashMap?
Stores **key-value pairs**

- Unique keys
- No order

## 📦 Import
    import java.util.HashMap;
    import java.util.Map;

## 🚀 Create
    HashMap<String, Integer> map = new HashMap<>();

## ➕ Add
    map.put("Apple", 10);

## 🔍 Access
    map.get("Apple");

## 🔁 Looping

### entrySet
    for (Map.Entry<String, Integer> e : map.entrySet()) {
        System.out.println(e.getKey() + " -> " + e.getValue());
    }

### keySet
    for (String key : map.keySet()) {
        System.out.println(key);
    }

### values
    for (int val : map.values()) {
        System.out.println(val);
    }

### forEach
    map.forEach((k, v) -> System.out.println(k + " -> " + v));

## ⏱️ Complexity
- Time: **O(1)**
- Space: **O(n)**