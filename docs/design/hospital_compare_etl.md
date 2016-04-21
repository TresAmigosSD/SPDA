Did some check on the data and a few findings:
### Table Statistics
- # of tables. In total 25: 1 with general information and 24 with measures. About half are wide and half are long tables. 2 tables with data issue: all measure responses are N/A - _need to follow up_
- # of fields. Each of the 24 tables has a few pairs of {measure_id, measure_response}, with CCN as a linking key. These are the useful fields we can extract from each raw table. The selection of fields is done in a sheet. ~200 out of 500 fields are marked as "Selected"
- # of measures. There are ~150 measures (or up to 200, depending on how to count: 1 survey question as 1 measure or 1 survey answer as 1 measure). The measure ID is standard and we can use most of them in the master table. For a few ones, we have to add "suffix" to further distinguish

### ETL
- Input file. All files are .csv. Most file names will keep the same while a few (HVBP_) contains update_dt. All have header. For some files, the first row is field sequence number (1,2,3...)
- Table level. Most tables have comma (,) as field separator and double quote ("") as field delimiter. The rest (about 5) use a hybrid: some fields (mostly free text, eg, hospital name) with delimiter ("") and others don't
- Field level. CCN and Measure_ID fields are pretty clean. Some Measure_IDs contain special char (blank or %) and need to translate to a standard field name. The Measure_Response (or Score, or Value, etc) requires lots of processing: convert "Not Available" to null, convert survey result from text "7 out of 10" to integer 7, etc.
- Variety of measure. Most measures have one value. A few have multiple. _Need to discuss if to keep and how to_. Two examples:
    1. Some measures are ratio. And numerator / denominator also exist
    2. For HVBP related measures, each has 4 values: rate (double from 0 to 1), achievement points (anchoring the objective), improvement points (comparing to previous measurement period) and measure score (overall rate).
- Footnote. For missing values, the footnote will give a reason code. _Need to discuss if we should keep it and how to_

### Next Step
- Get more context about the objectives of creating the hospital master, eg, how people will use the master? Which information is more important or easier to be utilized? While making decisions of details, which general criteria to follow?
- Design the structure of master. Typically there are two ways:
    1. Wide table. CCN level, each measure_id (and its variety) as a column, with cell as value of measure
    2. Long table. Main columns are CCN, Measure_ID and Response.
