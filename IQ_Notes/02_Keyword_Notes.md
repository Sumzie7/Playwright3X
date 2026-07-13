# JavaScript Keywords - Notes

## What are Keywords?
Keywords are **reserved words** in JavaScript that have a predefined meaning. They **cannot** be used as identifiers (variable names, function names, etc.).

---

## All JavaScript Reserved Keywords (ES6+)

### Declaration & Scope Keywords
| Keyword | Purpose |
|---------|---------|
| `var` | Declares a function-scoped / global variable |
| `let` | Declares a block-scoped variable |
| `const` | Declares a block-scoped constant (can't be reassigned) |

### Control Flow Keywords
| Keyword | Purpose |
|---------|---------|
| `if` | Conditional block |
| `else` | Alternate conditional block |
| `switch` | Multi-way conditional |
| `case` | A branch in switch |
| `break` | Exits a loop or switch |
| `default` | Default case in switch |
| `continue` | Skips to next iteration of a loop |

### Loop Keywords
| Keyword | Purpose |
|---------|---------|
| `for` | For loop |
| `while` | While loop |
| `do` | Do-while loop |
| `in` | Iterates over object properties (`for...in`) |
| `of` | Iterates over iterable values (`for...of`) |

### Function & Class Keywords
| Keyword | Purpose |
|---------|---------|
| `function` | Declares a function |
| `return` | Returns a value from a function |
| `class` | Declares a class |
| `extends` | Creates a subclass |
| `super` | Calls parent class constructor/method |
| `new` | Creates an instance of a class/constructor |
| `this` | Refers to the current execution context |
| `yield` | Pauses/resumes a generator function |
| `async` | Declares an async function |
| `await` | Waits for a Promise |

### Error Handling Keywords
| Keyword | Purpose |
|---------|---------|
| `try` | Defines a block to test for errors |
| `catch` | Catches an error from try block |
| `finally` | Executes after try/catch regardless of outcome |
| `throw` | Throws a custom error |

### Object & Module Keywords
| Keyword | Purpose |
|---------|---------|
| `import` | Imports modules |
| `export` | Exports modules |
| `from` | Specifies module path in import |
| `as` | Alias in import/export |
| `get` | Defines a getter |
| `set` | Defines a setter |
| `static` | Defines a static method/property |
| `instanceof` | Checks if object is instance of a class |
| `typeof` | Returns the type of a value |
| `delete` | Deletes an object property |
| `void` | Evaluates expression and returns undefined |

### Other Keywords
| Keyword | Purpose |
|---------|---------|
| `debugger` | Invokes debugging breakpoint |
| `with` | Extends scope chain (deprecated) |

### Values & Literals
| Keyword | Purpose |
|---------|---------|
| `true` | Boolean true |
| `false` | Boolean false |
| `null` | Represents no value |
| `undefined` | Represents uninitialized value |

### Future Reserved Keywords (Strict Mode)
- `implements`, `interface`, `let`, `package`, `private`, `protected`, `public`, `static`, `yield`

---

## var vs let vs const — Comparison

| Feature | `var` | `let` | `const` |
|---------|-------|-------|---------|
| **Scope** | Function-scoped | Block-scoped `{}` | Block-scoped `{}` |
| **Reassignable** | ✅ Yes | ✅ Yes | ❌ No |
| **Redeclarable** | ✅ Yes (same scope) | ❌ No (same scope) | ❌ No (same scope) |
| **Hoisted** | ✅ Yes (initialized as `undefined`) | ✅ Yes (not initialized — TDZ) | ✅ Yes (not initialized — TDZ) |
| **Temporal Dead Zone (TDZ)** | ❌ No | ✅ Yes | ✅ Yes |
| **Must be initialized** | ❌ No (defaults to `undefined`) | ❌ No (defaults to `undefined`) | ✅ Yes (must assign value) |
| **Window object property** | ✅ Yes (global `var` creates property) | ❌ No | ❌ No |

### Examples from course files:
```javascript
// var — can be redeclared, function-scoped
var a = 10;
var a = 20;  // ✅ allowed

// let — block-scoped, can't be redeclared
let x = 10;
// let x = 20;  // ❌ SyntaxError

// const — block-scoped, must be initialized, can't be reassigned
const MAX_SIZE = 100;
// MAX_SIZE = 200;  // ❌ TypeError
// const API_KEY;   // ❌ SyntaxError: Missing initializer
```

---

## Why Keywords Cannot Be Used as Identifiers

```javascript
// ❌ INVALID — keywords used as variable names
// let class = "invalid";
// let const = "invalid";
// let function = "invalid";

// ✅ VALID — case matters, so capitalised versions work
let Class = "valid";
let Const = "valid";
let Function = "valid";
```

---

## Key Takeaways for Interview Questions (IQ)

1. **Reserved words** — cannot be `var`, `let`, `const`, `class`, `function`, etc. as identifiers
2. **Case-sensitive** — `Function` is allowed (not a keyword), but `function` is reserved
3. **`let` & `const`** are block-scoped, `var` is function-scoped
4. **`const`** must be initialized at declaration time
5. **TDZ** — `let` and `const` exist in a Temporal Dead Zone from block start until declaration
