graph [
directed 1
node [
name "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ProductSearch
de.upb.examples.reengineering.store.logic.ProducerSearch
de.upb.examples.reengineering.store.logic.ICalculator
"
label "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ProductSearch
de.upb.examples.reengineering.store.logic.ProducerSearch
de.upb.examples.reengineering.store.logic.ICalculator
"
graphics
[hasFill 0
]
]
node [
name "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
label "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
graphics
[hasFill 0
]
]
edge [
source "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
target "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ProductSearch
de.upb.examples.reengineering.store.logic.ProducerSearch
de.upb.examples.reengineering.store.logic.ICalculator
"
label "Coupling = 1,00
ExternalAccessesCount = 6,00
PackageMapping = ,50
AbstractTypesCount = 3,00
DefaultMergeIndicatingMetric = ,27
TotalTypesCount = 9,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,33
DefaultCompositionIndicatingMetric = ,39
InternalAccessesCount = 6,00
NameResemblance = ,53
AfferentCoupling = ,00
EfferentCoupling = ,00
DirectoryMapping = ,00
InterfaceAccessesCount = 2,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ProductSearch
de.upb.examples.reengineering.store.logic.ProducerSearch
de.upb.examples.reengineering.store.logic.ICalculator
"
target "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = ,50
AbstractTypesCount = 3,00
DefaultMergeIndicatingMetric = ,29
TotalTypesCount = 9,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,25
NameResemblance = ,53
InternalAccessesCount = ,00
AfferentCoupling = ,00
EfferentCoupling = ,00
InterfaceAccessesCount = ,00
DirectoryMapping = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
]
