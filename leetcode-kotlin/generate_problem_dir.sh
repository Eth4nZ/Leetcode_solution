#! /bin/bash


# $1: class_name, #2: package_name
create_class() {
    creator_name="eth4"
    filename=src/main/kotlin/$2/$1.kt
    date=`date +%d/%m/%y`
    echo package $2 > $filename
    echo >> $filename
    echo "/**" >> $filename
    echo " * Created by $creator_name on ${date}." >> $filename
    echo " */" >> $filename
    echo >> $filename
    echo class $1 { >> $filename
    echo >> $filename
    echo } >> $filename
}

# $1: test_class_name, #2: package_name, #3: Index, #4: class_name
create_test_class() {
    creator_name="eth4"
    filename=src/test/kotlin/$2/$1.kt
    date=`date +%d/%m/%y`
    echo package $2 > $filename
    echo >> $filename
    echo "import org.junit.Assert.assertArrayEquals" >> $filename
    echo "import org.junit.Test" >> $filename
    echo >> $filename
    echo "/**" >> $filename
    echo " * Created by $creator_name on ${date}." >> $filename
    echo " */" >> $filename
    echo >> $filename
    echo class $1 { >> $filename
    echo "    val tests = listOf(
            intArrayOf(1,2,3,4,5,6,7,8)
    )
    val results = listOf(
            true
    )

    @Test
    fun test${3}${4}() {
        val tests = tests
        val data = tests.map { ${4}().func(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }" >> $filename
    echo >> $filename
    echo } >> $filename
}

echo Please input the Leetcode problem name

read name

name=${name//\ /_}
name=${name//./}
name=_$name
class_name=$(sed 's/_[0-9]*_//' <<<"$name")
number=$(Sed 's/[^0-9]*//g' <<<"$name")
class_name=${class_name//_/}
package_name=$(tr '[:upper:]' '[:lower:]' <<<"$name")
test_class_name=Test$number$class_name

mkdir src/main/kotlin/$package_name
create_class "$class_name" "$package_name"
mkdir src/test/kotlin/$package_name
create_test_class "$test_class_name" "$package_name" "$number" "$class_name"
