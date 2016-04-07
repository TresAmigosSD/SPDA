# Create Hospital Master Table Based on Public Data

## Background
The original goal was to create our own "hospital master" data from different public data sources. 
However since CMS made good progress on the hospital compare data, there is a very good chance 
that the hospital compare data themselves can be the master.

## Research Findings
Research on the ID of hospitals in CMS data:

**1. CCN**

- The provider ID is the hospital's CMS' Certification Number (CCN). It is the
  hospital’s identification number and is linked to its Medicare provider agreement. The CCN is used for CMS certification.  Certain types of health care facilities, including hospitals, seeking to participate in the Medicare program are required not only to satisfactorily complete the Medicare enrollment application, but also to be certified as meeting the Medicare health and safety standards. The CCN is also used for submitting and reviewing the hospital’s cost reports. The CCN number used to be called the "provider number," but with the advent of the statutorily mandated National Provider Identifier (NPI) number for claims processing, the CCN now plays a different role within the Medicare program. For more details of CCN, please see: http://www.jointcommission.org/faqs_ccn/

- CCN is a 6-digit unique ID. The first 2 digits are the GEO SSA State Code.
  After a quick check on hospital general information, every state has a single one (eg CA: 05) except TX has two (45, 67). The 3rd and 4th digits are used as a category identifier. For more details of the ID format, please see: http://www.resdac.org/sites/resdac.org/files/Provider%20Number%20Table.txt

- CCN, also known as provider ID, is widely used in various of websites to
  identify the hospital. Eg, adh.com provides a search based on CCN, etc: https://www.ahd.com/search.php

- In the hospital compare data, the ID is used in all hospital or more
  granular level data sets

- Nursing home compare data seems to use the same ID in all related data sets.
  It is called "Federal Provider Identifier" with 6-digit.

**2. NPI**

- NPI: The National Provider Identifier (NPI) is a unique identification
  number for covered health care providers (doctors, dentists, chiropractors, nurses and other medical staff). The NPI is a 10-digit, intelligence-free numeric identifier. This means that the numbers do not carry other information about healthcare providers, such as the state in which they live or their medical specialty. The NPI must be used in lieu of legacy provider identifiers in the HIPAA standards transactions. Covered health care providers and all health plans and health care clearing houses must use the NPIs in the administrative and financial transactions adopted under HIPAA (Health Insurance Portability and Accountability Act).

- Physician compare data use NPI as the key to each physician. In the data,
  another key (PAC ID) is used to identify a physician and the associated group practice. It is the link between physician and hospitals. 

**3. Summary**

- CCN is the key to the hospital (and nursing homes, _to confirm_) in CMS
  data.
- NPI (or PAC ID) is the key to physican and their group practice (hospital,
  etc.).
- We have to link CCN to NPI (or PAC ID) by figuring out the linking data or
  address matching.

**4. Next Step**
- explore the link between CCN and NPI (or PAC ID)

