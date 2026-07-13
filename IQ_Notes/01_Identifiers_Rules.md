# JavaScript Identifiers Rules

## What is an Identifier?

An identifier is a name used to identify variables, functions, classes, objects, and other entities in JavaScript. It's essentially the name you give to something in your code.

---

## Rules for Creating Valid Identifiers

### 1. **Allowed Characters**
- **Letters**: a-z, A-Z
- **Digits**: 0-9 (but cannot be the first character)
- **Underscore (_)**: Can appear anywhere, including as the first character
- **Dollar Sign ($)**: Can appear anywhere, including as the first character
- **Unicode Characters**: Letters from other languages are allowed

**Valid Examples:**
```javascript
let name;           // letters only
let name1;          // letters with digit
let _name;          // underscore prefix
let $name;          // dollar sign prefix
let nameAge;        // camelCase
let NameAge;        // PascalCase
let name_age;       // snake_case
```

### 2. **Cannot Start with a Digit**
- Identifiers must begin with a letter, underscore (_), or dollar sign ($)
- They cannot start with a number

**Valid:**
```javascript
let name1;          // ✅ Starts with letter, ends with digit
let _1name;         // ✅ Starts with underscore
let $1name;         // ✅ Starts with dollar sign
```

**Invalid:**
```javascript
let 1name;          // ❌ Starts with digit
let 123;            // ❌ Starts with digit
```

### 3. **Case Sensitive**
- JavaScript is case-sensitive
- `name`, `Name`, and `NAME` are three different identifiers

**Example:**
```javascript
let name = "John";
let Name = "Doe";
let NAME = "Smith";

console.log(name);  // Output: John
console.log(Name);  // Output: Doe
console.log(NAME);  // Output: Smith
```

### 4. **No Spaces Allowed**
- Identifiers cannot contain spaces
- Use camelCase or snake_case to separate words

**Valid:**
```javascript
let firstName;      // ✅ camelCase
let first_name;     // ✅ snake_case
let FirstName;      // ✅ PascalCase
```

**Invalid:**
```javascript
let first name;     // ❌ Contains space
let first-name;     // ❌ Contains hyphen (special character)
```

### 5. **No Special Characters**
- Only underscore (_) and dollar sign ($) are allowed as special characters
- Cannot use: `!`, `@`, `#`, `%`, `^`, `&`, `*`, `-`, `+`, `=`, `{`, `}`, `[`, `]`, etc.

**Valid:**
```javascript
let firstName$;     // ✅ Dollar sign allowed
let _firstName;     // ✅ Underscore allowed
let first_name$1;   // ✅ Mix of allowed characters
```

**Invalid:**
```javascript
let first-name;     // ❌ Hyphen not allowed
let first@name;     // ❌ @ symbol not allowed
let first.name;     // ❌ Dot not allowed
let first#name;     // ❌ # symbol not allowed
```

### 6. **Reserved Words Cannot Be Used**
- JavaScript has reserved keywords that cannot be used as identifiers
- Reserved words are predefined by JavaScript for specific purposes

**JavaScript Reserved Words:**
```
abstract, arguments, await, boolean, break, byte, case, catch, char, class, 
const, continue, debugger, default, delete, do, double, else, enum, eval, 
export, extends, false, final, finally, float, for, function, goto, if, 
implements, import, in, instanceof, int, interface, let, long, native, new, 
null, package, private, protected, public, return, short, static, super, 
switch, synchronized, this, throw, throws, true, try, typeof, var, void, 
volatile, while, with, yield
```

**Invalid:**
```javascript
let class = "Math";      // ❌ 'class' is a reserved word
let function = 5;        // ❌ 'function' is a reserved word
let return = "test";     // ❌ 'return' is a reserved word
let if = 10;             // ❌ 'if' is a reserved word
```

---

## Naming Conventions

### 1. **camelCase** (Variables and Functions)
- Start with lowercase
- Capitalize first letter of each subsequent word
- Most common for JavaScript

```javascript
let firstName = "John";
let lastName = "Doe";
function calculateAge() { }
```

### 2. **PascalCase** (Classes and Constructors)
- Start with uppercase
- Capitalize first letter of each word

```javascript
class UserProfile { }
class StudentRecord { }
function MyConstructor() { }
```

### 3. **UPPER_SNAKE_CASE** (Constants)
- All uppercase letters
- Use underscores to separate words
- Used for constants that don't change

```javascript
const MAX_AGE = 100;
const MIN_PASSWORD_LENGTH = 8;
const API_URL = "https://api.example.com";
```

### 4. **snake_case** (Less common in JavaScript, but used in some frameworks)
- All lowercase letters
- Use underscores to separate words

```javascript
let user_name = "John";
let user_age = 25;
```

---

## Valid vs Invalid Examples

| Identifier | Valid | Reason |
|-----------|-------|--------|
| `name` | ✅ | Valid - starts with letter |
| `_name` | ✅ | Valid - starts with underscore |
| `$name` | ✅ | Valid - starts with dollar sign |
| `name1` | ✅ | Valid - contains digit but not at start |
| `Name` | ✅ | Valid - different from `name` (case-sensitive) |
| `1name` | ❌ | Invalid - starts with digit |
| `name-age` | ❌ | Invalid - contains hyphen |
| `first name` | ❌ | Invalid - contains space |
| `first.name` | ❌ | Invalid - contains dot |
| `class` | ❌ | Invalid - reserved word |
| `let` | ❌ | Invalid - reserved word |
| `my-var` | ❌ | Invalid - contains hyphen |
| `my var` | ❌ | Invalid - contains space |

---

## Best Practices

1. **Use Meaningful Names**: Choose descriptive names that clearly indicate what the identifier represents
   ```javascript
   // Good
   let userAge = 25;
   
   // Bad
   let x = 25;
   ```

2. **Be Consistent**: Use the same naming convention throughout your code
   ```javascript
   // Good
   let firstName = "John";
   let lastName = "Doe";
   let emailAddress = "john@example.com";
   
   // Bad
   let firstname = "John";
   let LastName = "Doe";
   let email_address = "john@example.com";
   ```

3. **Avoid Single Letter Variables**: Except in loops (i, j, k)
   ```javascript
   // Good
   let count = 0;
   
   // Acceptable (in loops)
   for (let i = 0; i < 10; i++) { }
   ```

4. **Avoid Misleading Names**: Don't use names that could confuse developers
   ```javascript
   // Bad
   let l = "list";     // 'l' looks like '1'
   let O = "object";   // 'O' looks like '0'
   
   // Good
   let list = [];
   let obj = {};
   ```

5. **Use camelCase for Variables and Functions**
   ```javascript
   let userName = "John";      // ✅ Variable
   function getUserName() { }  // ✅ Function
   ```

6. **Use PascalCase for Classes**
   ```javascript
   class UserProfile { }       // ✅ Class
   class StudentRecord { }     // ✅ Class
   ```

---

## Summary

- Identifiers must start with a letter, underscore (_), or dollar sign ($)
- Can contain letters, digits, underscores, and dollar signs
- Cannot be reserved words
- Are case-sensitive
- Should follow naming conventions (camelCase, PascalCase, UPPER_SNAKE_CASE)
- Should be meaningful and descriptive
