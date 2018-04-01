package _811_subdomain_visit_count

/**
 * Created by eth4 on 01/04/18.
 */

class SubdomainVisitCount {
    fun subdomainVisits(cpdomains: Array<String>): List<String> {
        val ret = HashMap<String, Int>()
        for (domain in cpdomains) {
            val count = domain.split(" ")[0]
            var curDomain = domain.split(" ")[1]
            while(true) {
                if (ret.get(curDomain) != null)
                    ret.put(curDomain, ret.get(curDomain)!! + count.toInt())
                else
                    ret.put(curDomain, count.toInt())
                val temp = curDomain.split(delimiters = ".", limit = 2)
                if (temp.size > 1)
                    curDomain = temp[1]
                else
                    break
            }


        }

        return ret.map{ it.value.toString() + " " + it.key }.toList()
    }

}
