package org.tresamigos.spda.hlth.etl.input

import org.tresamigos.smv._

/** define all the raw inputs into the stage */

object ziphsa extends SmvCsvFile("aohc/ZipHsaHrr13.csv")
object hosphsa extends SmvCsvFile("aohc/hosp_hsa_hrr_2013.csv")
