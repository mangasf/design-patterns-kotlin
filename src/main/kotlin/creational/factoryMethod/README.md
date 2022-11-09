# Factory Method

```text
We have a logistics company that ships throughout Europe using trucks. We have the following information for each
of these trucks: vehicle identifier, last technical review carried out, type of transport container and means of
transport. In the case of our trucks, we have terrestrial and amphibious.

Our system must allow us to know the delivery plan of a truck at all times: type of container + means of transport.

---

Our company is having a lot of success and we are also going to introduce ship and plane transport.

Ships have two types of containers to carry cargo: FlatRack and Reefer. It is the only information they provide in
their delivery plan.

Aircraft also contain information about the flight hours of the vehicle. Your delivery plan only has information
about the means of delivery, air or water for amphibious aircraft.

All vehicles must be able to give information about the delivery plan.

---

In addition, all vehicles must be able to give us information about their next technical review:

Trucks: every four years.
Ships: every two years
Planes: every year


```