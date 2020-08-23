# Clojure Plug-in for NetBeans 12

Forked from [@GeertjanWielenga](https://github.com/GeertjanWielenga)'s [original work](https://blogs.oracle.com/geertjan/entry/leiningen_clojure_and_netbeans_ide).

# Known Problems

If the path to Leiningen is not given correctly the widget raises an exception
which I cant catch. -> Visual Issue.

## Roadmap

In no particular order:

* Code completion (local symbols only)
* lein deps
* Add preferences support (for lein path, classpath, etc.)
* Check build output 
* Check syntax highlighting for .cljs files
* REPL window (lein repl)
* Namespace navigation
* Code completion (project symbols and Java fields/methods)
* Support lein-ancient
* Clojars support (browse and add libraries, editing project.clj)
* Testing and debugging options
* More templates
* lein trampoline

2020-08-18

Took over. It works with Netbeans 12 and Java 11.

2020-08-20

Got a first Option Dialog going. It stores the path to Leinigen.

2020-08-23

ALl the collected links:

https://blogs.oracle.com/geertjan/leiningen,-clojure,-and-netbeans-ide
https://blogs.oracle.com/geertjan/parsing-the-command-line-to-enable-a-menu-item
http://bits.netbeans.org/dev/javadoc/org-netbeans-modules-javahelp/index.html?overview-summary.html
https://www.cnblogs.com/cuizhf/p/3505947.html
http://wiki.netbeans.org/Splash_Screen_Beginner_Tutorial