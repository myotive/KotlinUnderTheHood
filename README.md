# Kotlin: Under the hood
Kotlin is a great JVM language that affords a lot of modern programming concepts that either weren't available or faked for older versions of Java.

But how does Kotlin compiler make this happen? In this talk, we'll explore Kotlin at a lower level. We'll take a look at the class file which gets generated from the Kotlin compiler and explore what happens when it gets decompiled back to Java. Along the way, we'll talk about some of the hidden costs of Kotlin and how it might impact platforms such as Android.

### Samples contained in this repo
* KotlinSample
  * This is a stock Android sample that contains both a Java and Kotlin module. I'm using this to show what differences are contained in the Android APK.
* KotlinUnderTheHoodSamples
  * This application contains a lot of sample Kotlin code I use to look at the Java code that gets generated. You can explore the decompiled version of the code by using the IntelliJ **Tools** > **Kotlin** > **Show Kotlin Bytecode** and then selecting the Decompile button in the Kotlin Bytecode window.


> Todo: add slides

#### Research
* [Exploring Kotlin’s hidden costs - Part 1](https://medium.com/@BladeCoder/exploring-kotlins-hidden-costs-part-1-fbb9935d9b62)
* [Exploring Kotlin’s hidden costs - Part 2](https://medium.com/@BladeCoder/exploring-kotlins-hidden-costs-part-2-324a4a50b70)
* [Exploring Kotlin’s hidden costs - Part 3](https://medium.com/@BladeCoder/exploring-kotlins-hidden-costs-part-3-3bf6e0dbf0a4)
* [Response to Kotlin Hidden Costs](https://sites.google.com/a/athaydes.com/renato-athaydes/posts/kotlinshiddencosts-benchmarks)
* [Hidden Cost Benchmarks](https://willowtreeapps.com/ideas/kotlins-hidden-costs-android-benchmarks)
* [Byte Code Analysis](https://www.slideshare.net/intelliyole/kotlin-bytecode-generation-and-runtime-performance?utm_content=buffer4e6c0&utm_medium=social&utm_source=twitter.com&utm_campaign=buffer)
* [Exploring the .class side of Kotlin](https://proandroiddev.com/exploring-the-class-side-of-kotlin-d4af0d1065e2)
* [class file vs dex file](https://xsolve.software/blog/differences-between-class-and-dex-files-in-java-android/)
* [Kotlin: Uncovered - Part 1](https://collectiveidea.com/blog/archives/2017/05/16/kotlin-uncovered-part-1)
* [Kotlin: Uncovered - Part 2](https://collectiveidea.com/blog/archives/2017/05/19/kotlin-uncovered-part-2)
* [Kotlin: Uncovered - Part 3](https://collectiveidea.com/blog/archives/2017/05/24/kotlin-uncovered-part-3)
* [Kotlin: Uncovered - Part 4](https://collectiveidea.com/blog/archives/2017/06/06/kotlin-uncovered-part-4)
* [Kotlin: Uncovered - Part 5](https://collectiveidea.com/blog/archives/2017/06/20/kotlin-uncovered-part-5)

* [Kotlin: Uncovered (DroidCon Boston) - Victoria Gonda ](https://slideslive.com/38900603/kotlin-uncovered)
* [Kotlin Fundamentals - Pluralsight - Kevin Jones](https://app.pluralsight.com/library/courses/kotlin-fundamentals/table-of-contents)
* [Kotlin Bytecode Generation and Runtime Performance]- (https://vimeo.com/171765019)

#### Tools
* [Bytecode Viewer](https://github.com/borisf/classyshark-bytecode-viewer)
